package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MultipleocTest {
    Multipleoc multipleocc;


    @Before
    public void setUp() throws Exception {
    multipleocc =new Multipleoc();
    }

    @After
    public void tearDown() throws Exception {
    multipleocc = null;
    }

    @Test
    public void multiOccOf() {
    String expectedValue =   "Found at : 4-6\n"+
                             "Found at : 10-12\n"+
                             "Found at : 27-29" ;
    String actualValue = multipleocc.multiOccOf("She sells seashells by the seashore", "se");
    assertEquals(expectedValue,actualValue);
    }
}