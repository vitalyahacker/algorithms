package com.vitalya.easy;

import java.util.List;

public class FindSecondMax {
    public static void main(String[] args) {
        System.out.println(findSecondMax(List.of(7, 1)));
    }

    public static Integer findSecondMax(List<Integer> numbers) {

        if (numbers.size() < 2) throw new RuntimeException();

        Integer max = numbers.get(0);
        Integer secondMax = null;

        for (int i = 0; i < numbers.size(); i++) {
            Integer currentValue = numbers.get(i);

            if (currentValue > max) {
                secondMax = max;
                max = currentValue;
            } else {
                if (
                        !currentValue.equals(max)
                                && (secondMax == null || currentValue > secondMax)
                ) {
                    secondMax = currentValue;
                }
            }
        }
        if (secondMax == null) throw new RuntimeException();

        return secondMax;
    }
}
