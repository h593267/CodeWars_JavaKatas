package no.arnemunthekaas;

import java.util.ArrayList;
import java.util.List;

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
