package no.arnemunthekaas;

// https://www.codewars.com/kata/590e03aef55cab099a0002e8/train/java
public class Incrementer {
    public static int[] incrementer(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += i+1;
            numbers[i] = numbers[i] % 10;
        }
        return numbers;
    }
}
