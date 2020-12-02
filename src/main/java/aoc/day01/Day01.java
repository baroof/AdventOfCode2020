package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
//        return input.isEmpty() ? "" : input.get(0);
        for (String sentry : input) {
            int entry = Integer.parseInt(sentry);
            int remainder = 2020 - entry;
            if (input.contains(Integer.toString(remainder))) {
                String result = Integer.toString(entry * remainder);
                return result;
            }
        }
        return "no matches";
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
