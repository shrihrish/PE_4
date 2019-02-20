package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegularexpTest {
    Regularexp pattern;

    @Before
    public void setUp() throws Exception {
        pattern = new Regularexp();
    }

    @After
    public void tearDown() throws Exception {
    pattern = null;
    }

    @Test
    public void reguExp() {
        Boolean expected = true;
        Boolean actual = pattern.reguExp("This is a Harry");
        assertEquals(expected,actual);
    }

    @Test
    public void regExpr()
    {
        Boolean actual = pattern.reguExp(null);
        assertNull(actual);
    }
}