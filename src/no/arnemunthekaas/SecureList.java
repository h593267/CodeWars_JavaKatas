package no.arnemunthekaas;

import java.util.ArrayList;
import java.util.List;

public class SecureList {

    private List<Integer> numbers;

    public SecureList(int[] numbers) {
        this.numbers = new ArrayList<>();
        for (int num : numbers)
            this.numbers.add(num);
    }

    public int get(int index) {
        return numbers.remove(index);
    }

    public int size() {
        return numbers.size();
    }

    @Override
    public String toString() {
        String str = "[";

        if(size() > 0) {
            for (int i = 0; i < size() - 1; i++)
                str += numbers.get(i) + ",";

            str += numbers.get(size() - 1);

            numbers.clear();
        }

        str += "]";
        return str;
    }
}

