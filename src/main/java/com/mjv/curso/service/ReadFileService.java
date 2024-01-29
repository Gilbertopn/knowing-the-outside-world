package com.mjv.curso.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileService {
        public static String[] readLinesFromFile(String path) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                return br.lines().toArray(String[]::new);
            } catch (IOException e) {
                e.printStackTrace();
                return new String[0];
            }
        }
    }


