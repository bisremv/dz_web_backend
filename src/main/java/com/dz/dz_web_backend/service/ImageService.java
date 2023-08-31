package com.dz.dz_web_backend.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.dz.dz_web_backend.MODEL.Image;
import com.dz.dz_web_backend.dao.ImageDao;

@Service
public class ImageService {
    @Autowired
    private ImageDao imageService;
    private final String PATH = "C:\\Users\\Bisre_mv\\Documents\\ANGULAR\\test img\\New folder\\";

    @Transactional
    public Image uploadImage(MultipartFile file) throws IOException {
        Optional<Image> existingImageObject = imageService.findByName(file.getOriginalFilename());

        // Handle the case when an image with the same name exists
        if (existingImageObject.isPresent()) {
            String existingImagePath = existingImageObject.get().getImagePath();
            // Delete the existing image file

            Files.deleteIfExists(Paths.get(existingImagePath));
            // Delete the existing entry from the database and get usage value
            int usage_count = existingImageObject.get().getUsage_count();
            imageService.deleteByName(file.getOriginalFilename());

            // set parameters file and number of object that use this
            return saveImg(file, usage_count);
            // Save the new image
        } else {
            // If an image with the same name doesn't exist, simply save the new image
            return saveImg(file, 0);
        }
    }

    @Transactional
    public void ChangeImage(MultipartFile file, String oldname) {
        Optional<Image> model = imageService.findByName(oldname);
        long id = model.get().getId();
        try {
            uploadImage(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String existingImagePath = model.get().getImagePath();
        int count = model.get().getUsage_count();
        if (count < 2) {
            // Delete the existing image file
            try {
                Files.deleteIfExists(Paths.get(existingImagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Delete the existing entry from the database
            imageService.deleteById(id);
        }
        if (model.get().getUsage_count() >= 2) {
            Image pImage = model.get();
            pImage.setUsage_count(count - 1);
            imageService.save(pImage);
        }

    }

    public Image saveImg(MultipartFile file, int usage_count) {
        String fullPath = PATH + file.getOriginalFilename();
        Image pImage = new Image();
        pImage.setName(file.getOriginalFilename());
        pImage.setType(file.getContentType());
        pImage.setImagePath(fullPath);
        pImage.setUsage_count(usage_count + 1);
        try {
            file.transferTo(new File(fullPath));
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return imageService.save(pImage);
    }

    public byte[] downloadImage(String fileName) {
        Optional<Image> imageObject = imageService.findByName(fileName);
        String fullPath = imageObject.get().getImagePath();
        try {
            return Files.readAllBytes(new File(fullPath).toPath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Transactional
    public void deleteImage(long id) {
        Optional<Image> model = imageService.findById(id);
        String existingImagePath = model.get().getImagePath();
        int count = model.get().getUsage_count();
        if (count < 2) {
            // Delete the existing image file
            try {
                Files.deleteIfExists(Paths.get(existingImagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Delete the existing entry from the database
            imageService.deleteById(id);
        }
        if (model.get().getUsage_count() >= 2) {
            Image pImage = model.get();
            pImage.setUsage_count(count - 2);
            imageService.save(pImage);
        }
    }

}
