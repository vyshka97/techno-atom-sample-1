package ru.odnoklassniki.stringSorter;

import org.junit.Assert;
import org.junit.Test;
import ru.odnoklassniki.ClassToBeTested;

import java.util.List;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

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

    @Test
    public void testTwoStringsAreReturnedInResponse() throws Exception{
        final String str1 = "string1";
        final String str2 = "string11";
        final List<String> sortedStrings = ClassToBeTested.sortStringsByLength(str1, str2);

        Assert.assertThat(
                "В ответе неправильное количество строк",
                sortedStrings,
                hasSize(equalTo(2))
        );
    }

    @Test
    public void testBothInputStringsAreInResponse() throws Exception{
        final String str1 = "string1";
        final String str2 = "string11";
        final List<String> sortedStrings = ClassToBeTested.sortStringsByLength(str1, str2);

        Assert.assertThat(
                "В ответе не те строки, которые были введены",
                sortedStrings,
                allOf(
                        hasItem(str1),
                        hasItem(str2)
                )
        );
    }
}
