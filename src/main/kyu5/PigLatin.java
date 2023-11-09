package kyu5;

/*
DESCRIPTION:
    Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    Leave punctuation marks untouched.

    Examples
    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
 */
public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        String[] words = str.split("\\s");
        StringBuffer result = new StringBuffer();
        for (String s : words) {
            if (Character.isLetter(s.charAt(s.length() - 1)))
                result.append(" " + s.substring(1) + s.charAt(0) + "ay");
            else
                result.append(s);
        }
        if (str.charAt(str.length()-2)==' ') {
            result.setLength(result.length() - 1);
            result.append(" "+words[words.length-1]);
        }
        return result.toString().trim();
    }
}
