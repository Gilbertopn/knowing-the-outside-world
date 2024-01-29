package com.mjv.curso.service;

import java.util.Arrays;

public class ProcessFileService {
    public static void processAndPrintStats(String[] lines) {

        int numberOfArrays = lines.length;

        int totalCharacters = Arrays.stream(lines).mapToInt(String::length).sum();

        Arrays.sort(lines);

        System.out.println("Number of heroes: " + numberOfArrays);
        System.out.println("Total characters: " + totalCharacters);
        System.out.println("\n" + "Heroes sorted alphabetically:\n");
        Arrays.stream(lines).forEach(System.out::println);
    }
}