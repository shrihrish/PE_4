package com.stackroute.practice4;
import  java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Multipleoc {

    public String multiOccOf(String str,String s)
    {
        String found = "";
        Pattern  pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(str);

        int count =0;
        while(matcher.find()) {
            found += "Found at : "+ matcher.start()+ "-" + matcher.end()+"\n";
        }
        return  found.trim();
    }
}
