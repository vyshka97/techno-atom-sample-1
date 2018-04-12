package ru.odnoklassniki.exampleTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maksim Egorichev on 4/12/18 at 1:06 PM
 */
public class TestSampleTest1 {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass is executed once before all classes");
    }

    @Before
    public void setUp() {
        System.out.println("Before is executed before each class");
    }

    @Test
    public void testNumberOne() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testNumberTwo() {
        Assert.assertNotEquals(2, 1 + 1);
    }

    @After
    public void tearDown() {
        System.out.println("After is executed after each class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass is executed once after all classes");
    }
}
