package com.mjv.curso.service;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileService {
    public static void writeLinesToFile(String[] lines, String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}