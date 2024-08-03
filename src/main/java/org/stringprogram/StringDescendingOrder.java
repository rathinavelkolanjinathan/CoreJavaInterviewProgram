package org.stringprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDescendingOrder {
    public static void main(String[] args) {
        String [] ss ={"4","8","5","7","9","1"};
        Arrays.stream(ss).sorted(Comparator.reverseOrder()).forEach(s->System.out.println
                 (s));//descending
    }
}
