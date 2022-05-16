package no.arnemunthekaas;

//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java
public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        if (names.length == 0)
            return "no one likes this";

        if (names.length == 1)
            return names[0] + " likes this";

        if (names.length == 2)
            return names[0] + " and " + names[1] + " like this";

        if (names.length == 3)
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
    }
}
