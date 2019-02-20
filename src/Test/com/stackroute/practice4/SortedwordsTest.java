package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedwordsTest {
    Sortedwords sort;

    @Before
    public void setUp() throws Exception {
        sort = new Sortedwords();
    }

    @After
    public void tearDown() throws Exception {
        sort = null;
    }

    @Test
    public void sorting() {
        String expectedValue = "[A, A, Though, a, a, a, any, by, consist, dealing, discourse, idea, in, is, language, more, not, of, of, of, one, or, or, paragraph, paragraph, particular, point, required, self-contained, sentences, syntax, the, unit, with, writing]";
        String actualValue = sort.sorting("A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consist of one or more sentences . Though not required by the syntax of any language,");
        assertEquals(expectedValue,actualValue);
    }
}
