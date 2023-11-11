package kyu6;

/*
DESCRIPTION:
    Your task is to sort a given string. Each word in the string will contain a single number.
    This number is the position the word should have in the result.

    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

    If the input string is empty, return an empty string. The words in the input String
    will only contain valid consecutive numbers.
 */

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) return "";
        String[] word = words.split(" ");
        String[] word_sort = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            for (char c : word[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    word_sort[(c - '0') - 1] = word[i];
                }
            }
        }
        return String.join(" ",word_sort);
    }
}
