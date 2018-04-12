package ru.odnoklassniki.exampleTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Maksim Egorichev on 4/12/18 at 12:48 PM
 */
public class TestBeforeAndAfter {

    private long testNumber = 50L;

    @Before
    public void setUp() {
        testNumber += 2;
        System.out.println(testNumber);
    }

    @Test
    public void test() {
        Assert.assertTrue(testNumber < 51L);
    }

    @Test
    @Ignore
    public void testIgnored() {
        Assert.assertTrue(testNumber > 1L);
    }

    @After
    public void tearDown() {
        System.out.println("After is executed even if test has failed");
        System.out.println(testNumber);
    }
}
