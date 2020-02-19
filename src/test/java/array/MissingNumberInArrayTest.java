package array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberInArrayTest {
    private int[] array;
    private final int size = 100;

    @Test
    void missingNumber() {
        final Random random = new Random();
        array = random.ints(1, size + 1).distinct().limit(size).toArray();

        final int zeroed = random.nextInt(size);
        final int expectedNumber = array[zeroed];
        array[zeroed] = 0;

        assertTrue(expectedNumber == new MissingNumberInArray().missingNumber(array));
    }
}