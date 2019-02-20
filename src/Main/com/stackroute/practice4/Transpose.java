package com.stackroute.practice4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Transpose {

    public String transStr(String s) {
        byte[] strByteArr = s.getBytes();
        byte[] result = new byte[strByteArr.length];
        for (int i = 0; i < strByteArr.length; i++)
            result[i] = strByteArr[strByteArr.length - i - 1];
        String result1=new String(result);
        List<String> stringList= Arrays.asList(result1.split(" "));
        Collections.reverse(stringList);
        String [] require={};
        require= stringList.toArray(require);
        return String.join(" ",require);
    }
}
