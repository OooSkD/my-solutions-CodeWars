package kyu6;

import java.util.HashMap;
import java.util.Map;

/*
DESCRIPTION:
    Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<String, Integer> symbols_count = new HashMap<>();
        int count_symbol = 0;

        for (int i=0; i<text.length(); i++)
            symbols_count.merge(text.toLowerCase().charAt(i)+"", 1, Integer::sum);

        for (Integer value : symbols_count.values())
            if (value>1) count_symbol++;

        return count_symbol;
    }
}