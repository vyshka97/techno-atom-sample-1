package homework;

/**
 * Created by Maxim Vyshegorodtsev
 *
 * Проверка метода ClassToBeTested.generateIntSequence(int startingNumber, int itemsCount)
 *
 * Метод возвращает нам возрастающую последовательность целых чисел длины itemsCount, начиная
 * с startingNumber и далее увеличивая каждое число на 1
 *
 * Метод принимает на вход два параметра:
 * startingNumber - число, с которого начинается последователность
 * itemsCount - количсетво элементов последовательности
 *
 * Метод возвращает упорядоченный список целых чисел
 *
 * Чек-лист
 *
 * 1. Проверка метода на выброс исключения, если в первый аргумент передать
 *    число меньше 0
 *
 * 2. Проверка метода на выброс исключения, если в первый аргумент передать 0
 *
 * 3. Проверка метода на выброс исключения, если сумма двух аргументов будет
 *    больше допустимого максимального значения для типа Integer
 *
 * 4. Проверка на корректную работу метода, если сумма двух аргументов
 *    равна максимальному допустимому значению типа Integer
 *
 * 5. Проверка на корректную работу метода, если сумма двух аргументов
 *    меньше либо равно максимальному допустимому значению для типа Integer
 *
 */

import org.junit.Assert;
import org.junit.Test;
import ru.odnoklassniki.ClassToBeTested;

import java.util.List;
import java.util.Random;


public class TestGeneratorIntSequence {

    /**
     * Проверка метода на выброс исключения, если в первый аргумент передать
     * число меньше 0
     */
    @Test
    public void testThrowingExceptionIfItemsCountIsLessZero() {
        Random random = new Random();
        try {
            ClassToBeTested.generateIntSequence(random.nextInt(), -random.nextInt(Integer.MAX_VALUE) - 2);
            Assert.fail();
        }

        catch (IllegalArgumentException ex) {
            Assert.assertEquals("itemsCount must be greater than 0", ex.getMessage());
        }
    }

    /**
     * Проверка метода на выброс исключения, если в первый аргумент передать 0
     */
    @Test
    public void testThrowingExceptionIfItemsCountIsZero() {
        Random random = new Random();
        try {
            ClassToBeTested.generateIntSequence(random.nextInt(), 0);
            Assert.fail();
        }

        catch (IllegalArgumentException ex) {
            Assert.assertEquals("itemsCount must be greater than 0", ex.getMessage());
        }
    }

    /**
     * Проверка метода на выброс исключения, если сумма двух аргументов будет
     * больше допустимого максимального значения для типа Integer
     */
    @Test
    public void testThrowingExceptionIfSumIsGreaterMaxInteger() {
        int min = Integer.MAX_VALUE / 2 + 1;
        int max = Integer.MAX_VALUE;
        int randomNumber1 = (int) (Math.random() * (max - min)) + min;
        int randomNumber2 = (int) (Math.random() * (max - min)) + min;
        try {
            ClassToBeTested.generateIntSequence(randomNumber1, randomNumber2);
            Assert.fail();
        }

        catch (IllegalArgumentException ex) {
            Assert.assertEquals("can't generate an int greater than integer's max value", ex.getMessage());
        }
    }

    /**
     * Проверка на корректную работу метода, если сумма двух аргументов
     * равна максимальному допустимому значению типа Integer
     */
    @Test
    public void testCorrectIntSequenceIfSumIsMaxInteger() {
        int startingNumber = 0;
        List<Integer> intSequence = ClassToBeTested.generateIntSequence(startingNumber, Integer.MAX_VALUE);
        Assert.assertNotNull(intSequence);
        Assert.assertFalse(intSequence.isEmpty());
        Assert.assertEquals(intSequence.size(), Integer.MAX_VALUE);
        for (int element : intSequence) {
            Assert.assertEquals(startingNumber++, element);
        }
    }

    /**
     * Проверка на корректную работу метода, если сумма двух аргументов
     * меньше максимального допустимого значения для типа Integer
     */

    @Test
    public void testCorrectIntSequence() {
        int startingNumber = -5;
        List<Integer> intSequence = ClassToBeTested.generateIntSequence(startingNumber, 4);
        Assert.assertNotNull(intSequence);
        Assert.assertFalse(intSequence.isEmpty());
        Assert.assertEquals(intSequence.size(), 4);
        for (int element : intSequence) {
            Assert.assertEquals(startingNumber++, element);
        }
    }


}
