package com.company.service;

import com.company.entity.ImageDescriptor;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
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

    public List<ImageDescriptor> readImageDescriptors(String fileName) throws IOException {
        List<ImageDescriptor> resList = new ArrayList<>();
        List<String> fileContentInStringList = readFileIntoListOfStrings(fileName);
        for(String string:fileContentInStringList) {
            String[] arr = string.split("\\s+");
            resList.add(new ImageDescriptor(arr[0], arr[1]));
        }
        return resList;
    }

    private List<String> readFileIntoListOfStrings(String fileName) throws IOException {
        List<String> resList = new ArrayList<>();
        Stream<String> lines = Files.lines(Paths.get(fileName));
        return resList = lines.collect(Collectors.toList());
    }
}
