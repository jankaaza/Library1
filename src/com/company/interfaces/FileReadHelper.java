package com.company.interfaces;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public interface FileReadHelper {
    ArrayList<String> ReadFromFile(File file) throws IOException;
}
