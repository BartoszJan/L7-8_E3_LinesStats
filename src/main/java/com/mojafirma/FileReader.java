package com.mojafirma;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileReader {

    String path = "C:\\Users\\Bartek\\IdeaProjects\\Zadania domowe\\7-8 Zajecia\\Zad3\\text.txt";
    BufferedReader reader = null;
    ArrayList<LineStats> statisticsList = new ArrayList<>();

    public ArrayList<LineStats> read() {
        try {
            reader = new BufferedReader(new java.io.FileReader(path));
            String line = null;
            int lineLength;
            int upperNum;
            int lowNum;
            int volwerNum;
            while ((line = reader.readLine()) != null) {
                lineLength = LineStats.calculateLineLenght(line);
                upperNum = LineStats.calculateBigLettersNumber(line);
                lowNum = LineStats.calculateSmallLettersNumber(line);
                volwerNum = LineStats.calculateVowelsLettersNumber(line);
                statisticsList.add(new LineStats(lineLength, upperNum, lowNum, volwerNum));
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return statisticsList;
    }
}

