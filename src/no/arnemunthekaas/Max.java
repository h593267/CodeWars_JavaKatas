package no.arnemunthekaas;

import java.util.Arrays;

// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java
public class Max {
    public static int sequence(int[] arr) {
        if (arr.length == 0)
            return 0;

        if (Arrays.stream(arr).min().getAsInt() >= 0)
            return Arrays.stream(arr).sum();

        if (Arrays.stream(arr).max().getAsInt() <= 0)
            return 0;

        int highestSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= arr.length; j++) {
                if (Arrays.stream(Arrays.copyOfRange(arr, i, j)).sum() > highestSum)
                    highestSum = Arrays.stream(Arrays.copyOfRange(arr, i, j)).sum();
            }
        }

        return highestSum;
    }
}
