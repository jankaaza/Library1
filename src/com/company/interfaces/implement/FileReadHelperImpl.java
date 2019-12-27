package com.company.interfaces.implement;

import com.company.interfaces.FileReadHelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadHelperImpl implements FileReadHelper {
    @Override
    public ArrayList<String> ReadFromFile(File file) throws IOException {
            Scanner s = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            while (s.hasNext()) {
                list.add(s.next());

            }
            s.close();
            return list;
    }
}
