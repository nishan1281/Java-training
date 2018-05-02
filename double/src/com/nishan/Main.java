package com.nishan;

import java.text.DecimalFormat;
import java.text.Format;

public class Main {

    public static void main(String[] args) {
        double pounds = 200d;
        double results = pounds * 0.45359237d;

        DecimalFormat fourF = new DecimalFormat("#.######");

        System.out.println("kilograms=" + fourF.format(results));

        DecimalFormat fourNf = new DecimalFormat("#.#####");
        String resultsFloat = fourNf.format(results);
        System.out.println("kilograms=" + resultsFloat);

        DecimalFormat name1 = new DecimalFormat("#.##");
        String resultNew = name1.format(results);


        //unicode

        char unicodeTest = '\u00A9';
        System.out.println(unicodeTest);

        //string

        String text = "This sis sum text";
        System.out.println(text + " " + text);


    }
}
