package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountcharacterTest {
    Countcharacter countcharacter;

    @Before
    public void setUp() throws Exception {
        countcharacter = new Countcharacter();
    }

    @After
    public void tearDown() throws Exception {
        countcharacter= null;
    }

    @Test
    public void charcount() {
        int expectedValue = 3;
        int actualValue = countcharacter.charcount("hrishabh" , 'h');
        assertEquals(expectedValue,actualValue);
    }
}