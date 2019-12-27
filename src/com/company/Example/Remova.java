package com.company.Example;

import java.io.*;

public class Remova {
    public static void main(String[] args) throws IOException {
                File inputFile = new File("Yrysbek.txt");
                File tempFile = new File("Yrysbeknew.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String currentLine;

                while((currentLine = reader.readLine()) != null) {
                    if(null!=currentLine && !currentLine.equalsIgnoreCase("")){
                        writer.write(currentLine );
                    }
                }
                writer.close();
                reader.close();
                boolean successful = tempFile.renameTo(inputFile);
                System.out.println(successful);
            }
}
