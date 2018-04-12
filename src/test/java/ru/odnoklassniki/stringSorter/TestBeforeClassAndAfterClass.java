package ru.odnoklassniki.stringSorter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Maksim Egorichev on 4/12/18 at 12:48 PM
 */
public class TestBeforeClassAndAfterClass {

    @BeforeClass
    public static void setUpClass() throws Exception {
        throw new Exception();
    }

    @Test
    public void testThatWillNeverRun() {
        Assert.assertTrue(false);
    }
}
