package kyu7_8;
import java.util.HashMap;
import java.util.Map;

/*
DESCRIPTION:
    The goal of this exercise is to convert a string to a new string where each character
    in the new string is "(" if that character appears only once in the original string,
    or ")" if that character appears more than once in the original string.

    Ignore capitalization when determining if a character is a duplicate.
*/
public class DuplicateEncoder {
    public static String encode(String word){
        word=word.toLowerCase();
        Character c;
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            c=word.charAt(i);
            if (!(counts.containsKey(c)))
                counts.put(c,1);
            else
                counts.computeIfPresent(c, (k, v) -> v + 1);
        }
        String res="";
        for (int i = 0; i < word.length(); i++)  {
            res+= (counts.get(word.charAt(i)).equals(1)) ? "(": ")";
        }
        return res;
    }
}
