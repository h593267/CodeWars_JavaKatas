package no.arnemunthekaas;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> integers = new ArrayList<>();

        for (Object o : list) {
            if (o instanceof Integer)
                integers.add(o);
        }

        return integers;
    }
}
