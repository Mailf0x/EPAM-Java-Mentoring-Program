/*
    should use parallel streams from Java 8 Stream API
*/

package com.epam.cdp.m2.hw2.aggregator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javafx.util.Pair;

public class Java8ParallelAggregator implements Aggregator {

    @Override
    public int sum(List<Integer> numbers) {
        return numbers.parallelStream().reduce(0, (sum, x) -> sum + x);
    }

    @Override
    public List<Pair<String, Long>> getMostFrequentWords(List<String> words, long limit) {
        List<Pair<String, Long>> list = new ArrayList<>();

        words.parallelStream()
            // unique words
            .collect(Collectors.toSet()).parallelStream()
            .forEach(entry -> list.add(new Pair<String, Long>(entry,
                words.parallelStream()
                // occurrences
                .filter(word -> word.equals(entry))
                .count())));
        return list.parallelStream()
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
        return words.parallelStream()
            // more than one occurrence
            .filter(word1 -> words.parallelStream()
                .filter(word2 -> word2.equalsIgnoreCase(word1))
                .count() > 1)
            .map(word -> word.toUpperCase())
            // unique uppercased duplicates
            .collect(Collectors.toSet()).parallelStream()
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
