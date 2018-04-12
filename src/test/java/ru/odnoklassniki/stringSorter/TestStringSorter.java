package ru.odnoklassniki.stringSorter;

import org.junit.Assert;
import org.junit.Test;
import ru.odnoklassniki.ClassToBeTested;

import java.util.List;

/**
 * Created by Maksim Egorichev on 4/12/18 at 1:53 AM
 */
public class TestStringSorter {

    @Test
    public void testStringAreSortedCorrectly() throws Exception {
        final String str1 = "lalala";
        final String str2 = "lulululu";
        final List<String> sortedStrings = ClassToBeTested.sortStringsByLength(str1, str2);

        Assert.assertNotNull(sortedStrings);
        Assert.assertEquals(2, sortedStrings.size());
        Assert.assertEquals(str2, sortedStrings.get(0));
        Assert.assertEquals(str1, sortedStrings.get(1));
    }
}
