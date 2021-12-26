/*
    use Java 7 approach to do parallel tasks (e.g. you may use fork/join
        framework) to solve the problem
*/

package com.epam.cdp.m2.hw2.aggregator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

import javafx.util.Pair;

public class Java7ParallelAggregator implements Aggregator {

    private class SumFork extends RecursiveTask<Integer> {
        private List<Integer> numbers;
        // begin of sector
        private int begin;
        // end of sector
        private int end;

        public SumFork(List<Integer> numbers, int begin, int end) {
            this.numbers = numbers;
            this.begin = begin;
            this.end = end;
        }

        @Override
        public Integer compute() {
            Integer result = 0;

            for (int i = begin; i != end; i++) {
                result = result.intValue() + numbers.get(i).intValue();
            }
            return result;
        }
    }

    private class FrequencyFork extends RecursiveTask<Pair<String, Long>> {
        private List<Pair<String, Long>> pairs;
        private String word;
        // begin of sector
        private int begin;
        // end of sector
        private int end;

        public FrequencyFork(List<Pair<String, Long>> pairs, String word,
            int begin, int end) {
            this.pairs = pairs;
            this.word = word;
            this.begin = begin;
            this.end = end;
        }

        @Override
        public Pair<String, Long> compute() {
            // pair with word
            Pair<String, Long> result = null;

            for (int i = begin; i != end; i++) {

                if (pairs.get(i).getKey().equals(word)) {
                    result = pairs.get(i);
                    break;
                }
            }
            return result;
        }
    }

    private class DuplicateFork extends RecursiveAction {
        private List<String> duplicates;
        private List<String> words;
        private String word;
        // begin of sector
        private int begin;
        // end of sector
        private int end;

        public DuplicateFork(List<String> duplicates, List<String> words,
            String word, int begin, int end) {
            this.duplicates = duplicates;
            this.words = words;
            this.word = word;
            this.begin = begin;
            this.end = end;
        }

        @Override
        public void compute() {

            for (int i = begin; i != end; i++) {

                // unequal words
                if (!(words.get(i).equalsIgnoreCase(word))) {
                    continue;
                }

                // new first word
                if (!(duplicates.contains(words.get(i).toUpperCase()))) {
                    duplicates.add(words.get(i).toUpperCase());
                }

                // new second word
                if (!(duplicates.contains(word.toUpperCase()))) {
                    duplicates.add(word.toUpperCase());
                }
            }
        }
    }

    @Override
    public int sum(List<Integer> numbers) {
        List<SumFork> tasks = new ArrayList<>();
        int result = 0;
        int size = numbers.size();

        tasks.add(new SumFork(numbers, 0, size / 2));
        tasks.add(new SumFork(numbers, size / 2, size));

        for (SumFork sf : tasks) {
            sf.fork();
        }

        for (SumFork sf : tasks) {
            result += sf.join().intValue();
        }
        return result;
    }

    @Override
    public List<Pair<String, Long>> getMostFrequentWords(List<String> words,
        long limit) {
        List<Pair<String, Long>> result = new ArrayList<>();
        // uncut result
        List<Pair<String, Long>> list = new ArrayList<>();

        for (String w : words) {
            List<FrequencyFork> forks = new ArrayList<>();
            List<Pair<String, Long>> pairs = new ArrayList<>();
            // pair with w
            Pair<String, Long> pair = null;
            int size = list.size();

            forks.add(new FrequencyFork(list, w, 0, size / 2));
            forks.add(new FrequencyFork(list, w, size / 2, size));

            for (FrequencyFork ff : forks) {
                ff.fork();
            }

            for (FrequencyFork ff : forks) {
                pairs.add(ff.join());
            }

            for (Pair<String, Long> p : pairs) {

                // contains existing pair
                if (p != null) {
                    pair = p;
                    break;
                }
            }

            // no such pair
            if (pair == null) {
                list.add(new Pair<String, Long>(w, 1L));

            } else {
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
        int size = words.size();

        for (int i = 0; i < words.size() - 1; i++) {
            List<DuplicateFork> forks = new ArrayList<>();

            forks.add(new DuplicateFork(list, words, words.get(i), i + 1,
                (size + i + 1) / 2));
            forks.add(new DuplicateFork(list, words, words.get(i),
                (size + i + 1) / 2, size));

            for (DuplicateFork df : forks) {
                df.fork();
            }

            for (DuplicateFork df : forks) {
                df.join();
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
