package com.mojafirma;

/**
 * Created by Bartek on 2017-08-11.
 */
public class LineStats {
    int lineLenght;
    int bigLettersNumber;
    int smallLettersNumber;
    int vowelsNumber;

    public LineStats(int lineLenght, int bigLettersNumber, int smallLettersNumber, int vowelsNumber) {
        this.lineLenght = lineLenght;
        this.bigLettersNumber = bigLettersNumber;
        this.smallLettersNumber = smallLettersNumber;
        this.vowelsNumber = vowelsNumber;
    }

    public static int calculateLineLenght(String line){
        return line.length();
    }

    public static int calculateBigLettersNumber(String line){
        boolean whatCase;
        int j = 0;
        for (int i = 0; i < line.length(); i++) {
            whatCase = Character.isUpperCase(line.charAt(i));
            if (whatCase == true) {
                j++;
            }
        }
        return j;
    }

    public static int calculateSmallLettersNumber(String line){
        boolean whatCase;
        int j = 0;
        for (int i = 0; i < line.length(); i++) {
            whatCase = Character.isLowerCase(line.charAt(i));
            if (whatCase == true) {
                j++;
            }
        }
        return j;
    }

    public static int calculateVowelsLettersNumber(String line){
        String letter;
        String volwers = "AaEeYyIiOoĄąĘęUuÓó";
        int j = 0;
        for (int i = 0; i < line.length(); i++) {
            letter = line.substring(i, i+1);
            if (volwers.contains(letter)) {
                j++;
            }
        }
        return j;
    }

    @Override
    public String toString() {
        return "LineStats{" +
                "lineLenght=" + lineLenght +
                ", bigLettersNumber=" + bigLettersNumber +
                ", smallLettersNumber=" + smallLettersNumber +
                ", vowelsNumber=" + vowelsNumber +
                '}';
    }
}
