package kyu7_8;

/*
DESCRIPTION:
    Write a function to convert a name into initials. This kata strictly takes two words with one space in
    between them.

    The output should be two capital letters with a dot separating them.
    It should look like this:
        Sam Harris => S.H
        patrick feeney => P.F
*/
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] word = name.split(" ");
        return word[0].charAt(0) + "." +word[1].charAt(0);
    }
}
