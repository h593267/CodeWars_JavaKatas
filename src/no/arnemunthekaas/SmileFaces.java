package no.arnemunthekaas;

import java.util.List;

// https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        List<String> valid = List.of(":)", ":D", ";)", ";D", ":-)", ":-D", ";-)", ";-D", ":~)", ":~D", ";~)", ";~D");

        count = (int) arr.stream().filter(obj -> valid.contains(obj)).count();
        return count;
    }
}
