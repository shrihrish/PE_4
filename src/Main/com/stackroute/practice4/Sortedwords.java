package com.stackroute.practice4;

import java.util.Arrays;


public class Sortedwords {

    public String sorting(String para) {
        if (para == null) {
            return null;
        }

        String[] listOfWords = para.split("[\\s,\\.]+");
        Arrays.sort(listOfWords);
        return Arrays.toString(listOfWords);
    }
}

