package array;

import java.util.Arrays;

public class MissingNumberInArray {

    public int missingNumber(int[] ar) {
        final int actualSum = Arrays.stream(ar).sum();

        final int size = ar.length;
        final int expectedSum = ((size + 1) * size) >> 1;

        return expectedSum - actualSum;
    }
}
