package no.arnemunthekaas;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
public class CountingDuplicates {

    public static int duplicateCount(String text) {
        // STUPID STUPID UGLY UGLY
        return (int) text.toLowerCase().chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey).count();
    }
}
