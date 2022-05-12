package no.arnemunthekaas;

import java.util.Arrays;

public class StringSplit {

    public static String[] solution(String str) {
        String[] result = null;

        if (str.length() % 2 == 1)
            result = new String[str.length() / 2 + 1];
        else
            result = new String[str.length() / 2];


        Arrays.fill(result, "");

        for (int i = 0; i < str.length(); i++)
            result[i / 2] += str.charAt(i);


        if (str.length() % 2 == 1)
            result[result.length-1] += "_";

        return result;
    }
}