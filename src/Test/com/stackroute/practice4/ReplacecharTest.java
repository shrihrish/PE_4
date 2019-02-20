package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacecharTest {
    Replacechar repchar;

    @Before
    public void setUp() throws Exception {
        repchar = new Replacechar();
    }

    @After
    public void tearDown() throws Exception {
        repchar = null;
    }

@Test
public void test()
{
    String expectedValue = "faity fry";
    String actualValue = repchar.replaceChar("daily dry");
    assertEquals(expectedValue,actualValue);

}
}