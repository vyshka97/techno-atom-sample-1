package ru.odnoklassniki.exampleTests;

import org.junit.Assert;
import org.junit.Test;
import ru.odnoklassniki.ClassToBeTested;

/**
 * Created by Maksim Egorichev on 4/12/18 at 1:19 PM
 */
public class TestSampleNegativeTest1 {

    @Test(expected = IllegalArgumentException.class)
    public void testIfFirstStringIsNullExceptionIsThrown() throws Exception {
        ClassToBeTested.sortStringsByLength(null, "notEmptyString");
    }

    @Test
    public void testIfSecondStringIsNullExceptionIsThrown() throws Exception {
        try {
            ClassToBeTested.sortStringsByLength("notEmptyString", null);
            Assert.fail("Method did not throw exception when second string was null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("string2 must not be null or empty", e.getMessage());
        }
    }
}
