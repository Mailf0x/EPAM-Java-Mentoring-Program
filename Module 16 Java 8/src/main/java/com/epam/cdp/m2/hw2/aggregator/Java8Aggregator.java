/*
    should use Java 8 Stream API to solve the problem
*/

package com.epam.cdp.m2.hw2.aggregator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javafx.util.Pair;

public class Java8Aggregator implements Aggregator {

    @Override
    public int sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (sum, x) -> sum + x);
    }

    @Override
    public List<Pair<String, Long>> getMostFrequentWords(List<String> words, long limit) {
        List<Pair<String, Long>> list = new ArrayList<>();

        words.stream()
            // unique words
            .collect(Collectors.toSet()).stream()
            .forEach(entry -> list.add(new Pair<String, Long>(entry,
                words.stream()
                // occurrences
                .filter(word -> word.equals(entry))
                .count())));
        return list.stream()
            .sorted(new Comparator<Pair<String, Long>>() {

                public int compare(Pair<String, Long> p1, Pair<String, Long> p2) {

                    // different frequency
                    if (p1.getValue().longValue() != p2.getValue().longValue()) {
                        return -(int)(p1.getValue().longValue() -
                            p2.getValue().longValue());
                    }
                    return p1.getKey().compareTo(p2.getKey());
                }
            })
            .limit(limit)
            .collect(Collectors.toList());
    }

    @Override
    public List<String> getDuplicates(List<String> words, long limit) {
        return words.stream()
            // more than one occurrence
            .filter(word1 -> words.stream()
                .filter(word2 -> word2.equalsIgnoreCase(word1))
                .count() > 1)
            .map(word -> word.toUpperCase())
            // unique uppercased duplicates
            .collect(Collectors.toSet()).stream()
            .sorted(new Comparator<String>() {

                public int compare(String s1, String s2) {

                    if (s1.length() != s2.length()) {
                        return s1.length() - s2.length();
                    }
                    return s1.compareTo(s2);
                }
            })
            .limit(limit)
            .collect(Collectors.toList());
    }
}
