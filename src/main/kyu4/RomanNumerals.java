package kyu4;

/*
DESCRIPTION:
    Write two functions that convert a roman numeral to and from an integer value.
    Multiple roman numeral values will be tested for each function.

    Modern Roman numerals are written by expressing each digit separately starting with the left
    most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered:
    1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
    1666 uses each Roman symbol in descending order: MDCLXVI.

    Input range : 1 <= n < 4000

    In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
 */
public class RomanNumerals {

    private static final String[]   SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String toRoman(int n) {
        int temp=n;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < SYMBOLS.length; i++) {
            while(temp>=NUMBERS[i]) {
                temp-=NUMBERS[i];
                res.append(SYMBOLS[i]);
            }
        }
        return res.toString();
    }
    public static int fromRoman(String romanNumeral) {
        int res=0;
        StringBuilder temp = new StringBuilder(romanNumeral);
        for (int i = 0; i < SYMBOLS.length; i++) {
            while(temp.indexOf(SYMBOLS[i])==0) {
                temp.deleteCharAt(0);
                if (SYMBOLS[i].length()==2)
                    temp.deleteCharAt(0);
                res+=NUMBERS[i];
            }
            if (temp.length()==0) break;
        }
        return res;
    }
}
