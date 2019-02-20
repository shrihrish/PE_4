package com.stackroute.practice4;

public class Regularexp {
    public  Boolean reguExp(String str) {
        if (str == null) {
            return null;
        }
        return  str.matches(".*Harry.*");
    }
}
