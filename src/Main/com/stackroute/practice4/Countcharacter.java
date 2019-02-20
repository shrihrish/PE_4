package com.stackroute.practice4;

public class Countcharacter {
    public int  charcount(String s, char c) {
        int cn = s.length() - s.replaceAll(String.valueOf(c), "").length();

        return cn;

    }
}
