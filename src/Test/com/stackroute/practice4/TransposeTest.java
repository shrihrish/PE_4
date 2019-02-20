package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose transpose;


    @Before
    public void setUp() throws Exception {
     transpose = new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        transpose =null;
    }

    @Test
    public void transStr() {
    String expectedValue = ("a kciuq nworb xof spmuj revo eht yzal god");
    String actualValue = transpose.transStr("a quick brown fox jumps over the lazy dog");
    assertEquals(expectedValue,actualValue);
    }
}