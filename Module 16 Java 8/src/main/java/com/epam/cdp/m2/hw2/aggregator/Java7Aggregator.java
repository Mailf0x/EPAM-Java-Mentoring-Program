/*
    should use Java 7 approach to solve the problem (no packages from Java 8)
*/

package com.epam.cdp.m2.hw2.aggregator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javafx.util.Pair;

public class Java7Aggregator implements Aggregator {

    @Override
    public int sum(List<Integer> numbers) {
        int result = 0;

        for (Integer i : numbers) {
            result += i.intValue();
        }
        return result;
    }

    @Override
    public List<Pair<String, Long>> getMostFrequentWords(List<String> words, long limit) {
        List<Pair<String, Long>> result = new ArrayList<>();
        // uncut result
        List<Pair<String, Long>> list = new ArrayList<>();

        for (String w : words) {
            // pair with w
            Pair<String, Long> pair = null;

            for (Pair<String, Long> p : list) {

                if (p.getKey().equals(w)) {
                    pair = p;
                    break;
                }
            }

            // no such pair
            if (pair == null) {
                list.add(new Pair<String, Long>(w, 1L));

            } else {
                // new frequency of w
                long l = pair.getValue().longValue() + 1L;

                list.remove(pair);
                list.add(new Pair<String, Long>(w, l));
            }
        }
        list.sort(new Comparator<Pair<String, Long>>() {

            public int compare(Pair<String, Long> p1, Pair<String, Long> p2) {

                // different frequency
                if (p1.getValue().longValue() != p2.getValue().longValue()) {
                    return -(int)(p1.getValue().longValue() -
                        p2.getValue().longValue());
                }
                return p1.getKey().compareTo(p2.getKey());
            }
        });

        for (int i = 0; (i < list.size()) && (i < (int)limit); i++) {
            result.add(list.get(i));
        }
        return result;
    }

    @Override
    public List<String> getDuplicates(List<String> words, long limit) {
        List<String> result = new ArrayList<>();
        // uncut result
        List<String> list = new ArrayList<>();

        for (int i1 = 0; i1 < words.size() - 1; i1++) {

            for (int i2 = i1 + 1; i2 < words.size(); i2++) {

                // unequal words
                if (!(words.get(i1).equalsIgnoreCase(words.get(i2)))) {
                    continue;
                }

                // new first word
                if (!(list.contains(words.get(i1).toUpperCase()))) {
                    list.add(words.get(i1).toUpperCase());
                }

                // new second word
                if (!(list.contains(words.get(i2).toUpperCase()))) {
                    list.add(words.get(i2).toUpperCase());
                }
            }
        }
        list.sort(new Comparator<String>() {

            public int compare(String s1, String s2) {

                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });

        for (int i = 0; (i < list.size()) && (i < (int)limit); i++) {
            result.add(list.get(i));
        }
        return result;
    }
}
