package com.mojafirma;

import java.util.ArrayList;

/**
 * Created by Bartek on 2017-08-11.
 */
public class Main {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        ArrayList lineStatistic = fileReader.read();

        System.out.println(lineStatistic);
    }
}
