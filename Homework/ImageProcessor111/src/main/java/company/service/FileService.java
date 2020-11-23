package company.service;

import com.company.entity.ImageDescriptor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileService {

    public List<ImageDescriptor> readImageDescriptors(String fileName) throws IOException {
        List<ImageDescriptor> list = new ArrayList<>();
        List<String> listTemp = readFileIntoList(fileName);
        for (String str:listTemp) {
            String[] array = str.split("\\s+");
            list.add(new ImageDescriptor(array[0], array[1]));
        }

        return list;
    }

    private static List<String> readFileIntoList(String fileName) throws IOException {
        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            result = lines.collect(Collectors.toList());
        }

        return result;
    }
}
