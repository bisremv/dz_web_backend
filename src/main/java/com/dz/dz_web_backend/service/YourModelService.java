package com.dz.dz_web_backend.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.transaction.annotation.Transactional;

import com.dz.dz_web_backend.MODEL.YourModel;
import com.dz.dz_web_backend.dao.YourModelRepository;

@Service
public class YourModelService {
    @Autowired
    private YourModelRepository yourModelRepository;
    private final String PATH = "C:\\Users\\Bisre_mv\\Documents\\ANGULAR\\test img\\New folder\\";

    @Transactional
    public YourModel uploadImage(MultipartFile file) throws IOException {
        Optional<YourModel> existingImageObject = yourModelRepository.findByName(file.getOriginalFilename());

        // Handle the case when an image with the same name exists
        if (existingImageObject.isPresent()) {
            String existingImagePath = existingImageObject.get().getImagePath();
            // Delete the existing image file

            Files.deleteIfExists(Paths.get(existingImagePath));
            // Delete the existing entry from the database
            yourModelRepository.deleteByName(file.getOriginalFilename());
            return saveImg(file);
            // Save the new image
        } else {
            // If an image with the same name doesn't exist, simply save the new image
            return saveImg(file);
        }
    }

    public YourModel saveImg(MultipartFile file) throws IOException {
        String fullPath = PATH + file.getOriginalFilename();
        YourModel pImage = new YourModel();
        pImage.setName(file.getOriginalFilename());
        pImage.setType(file.getContentType());
        pImage.setImagePath(fullPath);
        file.transferTo(new File(fullPath));
        return yourModelRepository.save(pImage);
    }

    public byte[] downloadImage(String fileName) throws IOException {
        Optional<YourModel> imageObject = yourModelRepository.findByName(fileName);
        String fullPath = imageObject.get().getImagePath();
        return Files.readAllBytes(new File(fullPath).toPath());
    }

    public void deleteImage(long id) {
        Optional<YourModel> model = yourModelRepository.findById(id);
        String existingImagePath = model.get().getImagePath();
        // Delete the existing image file
        try {
            Files.deleteIfExists(Paths.get(existingImagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Delete the existing entry from the database
        yourModelRepository.deleteById(id);

    }

}
