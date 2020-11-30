package com.company.service;

import com.company.entity.DownloadedImage;
import com.company.entity.ImageDescriptor;

import javax.imageio.ImageIO;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileService {

    private static String CSV_SEPARATOR = ";";

    private FileConfigService configService;

    private FileNameGeneratorService nameGeneratorService;

    public FileService(FileConfigService configService, FileNameGeneratorService nameGeneratorService) {
        this.configService = configService;
        this.nameGeneratorService = nameGeneratorService;
    }

    public List<ImageDescriptor> readImageDescriptors(String fileName) {
        try {
            return Files
                    .lines(Paths.get(fileName))
                    .map(FileService::stringToImageDescriptor)
                    .collect(Collectors.toList());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return Collections.EMPTY_LIST;
        }
 /*       List<ImageDescriptor> resList = new ArrayList<>();
        List<String> fileContentInStringList = readFileIntoListOfStrings(fileName);
        for(String string:fileContentInStringList) {
            String[] arr = string.split("\\s+");
            resList.add(new ImageDescriptor(arr[0], arr[1]));
        }
        return resList;*/
    }

    private static ImageDescriptor stringToImageDescriptor(String string) {
        String[] split = string.split(CSV_SEPARATOR);
        return new ImageDescriptor(split[0], split[1]);
    }

    /*private List<String> readFileIntoListOfStrings(String fileName) throws IOException {
        List<String> resList = new ArrayList<>();
        Stream<String> lines = Files.lines(Paths.get(fileName));
        return resList = lines.collect(Collectors.toList());
    }*/

    public void saveImageAsFile(DownloadedImage imageToSave) {
        try {
            ImageIO.write(imageToSave.getImage(),
            "jpg",
            new File(configService.getPathToSaveImages(),
            nameGeneratorService.generateImageName(imageToSave.getDescriptor())));
        } catch (Exception ex) {
            ex.printStackTrace();
            //logger
        }
    }
}
