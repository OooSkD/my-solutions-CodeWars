package kyu4;

/*
DESCRIPTION:
    Your task in order to complete this Kata is to write a function which formats a duration,
    given as a number of seconds, in a human-friendly way.

    The function must accept a non-negative integer. If it is zero, it just returns "now".
    Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.

    It is much easier to understand with an example:

    * For seconds = 62, your function should return
    "1 minute and 2 seconds"
    * For seconds = 3662, your function should return
    "1 hour, 1 minute and 2 seconds"
    For the purpose of this Kata, a year is 365 days and a day is 24 hours.

    Note that spaces are important.

    Detailed rules
    The resulting expression is made of components like 4 seconds, 1 year, etc.
    In general, a positive integer and one of the valid units of time, separated by a space.
    The unit of time is used in plural if the integer is greater than 1.

    The components are separated by a comma and a space (", "). Except the last component,
    which is separated by " and ", just like it would be written in English.

    A more significant units of time will occur before than a least significant one. Therefore,
    1 second and 1 year is not correct, but 1 year and 1 second is.

    Different components have different unit of times. So there is not repeated units like in
    5 seconds and 1 second.

    A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0
    seconds is not valid, but it should be just 1 minute.

    A unit of time must be used "as much as possible". It means that the function should not
    return 61 seconds, but 1 minute and 1 second instead. Formally, the duration specified by of a component
    must not be greater than any valid more significant unit of time.
 */

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds <= 0)
            return "now";
        int i = 0;
        String result = "";
        while (seconds > 0) {
            if (i == 0) {
                result = formatTime(seconds, 60, 0, "second") + result;
                seconds = seconds / 60;
            } else if (i == 1) {
                result = formatTime(seconds, 60, result.length(), "minute") + result;
                seconds = seconds / 60;
            } else if (i == 2) {
                result = formatTime(seconds, 24, result.length(), "hour") + result;
                seconds = seconds / 24;
            } else {
                result = formatTime(seconds, 365, result.length(), "day") + result;
                if (seconds / 365 == 0) break;
                if (seconds / 365 == 1 && result.length() > 10)
                    result = "1 year, " + result;
                else if (seconds / 365 == 1 && result.length() == 0)
                    result = "1 year";
                else if (seconds / 365 == 1)
                    result = "1 year and " + result;
                else if (result.length() > 10)
                    result = seconds / 365 + " years, " + result;
                else if (result.length() == 0)
                    result = seconds / 365 + " years";
                else
                    result = seconds / 365 + " years and " + result;
                break;
            }
            i++;
        }
        return result;
    }

    public static String formatTime(int seconds, int d, int lenght, String s) {
        String result;
        if (seconds % d == 0) return "";
        else if (seconds % d == 1 && lenght > 10)
            return "1 " + s + ", ";
        else if (seconds % d == 1 && lenght == 0)
            return "1 " + s;
        else if (seconds % d == 1)
            return "1 " + s + " and ";
        else if (lenght > 10)
            return seconds % d + " " + s + "s, ";
        else if (lenght == 0)
            return seconds % d + " " + s + "s";
        else
            return seconds % d + " " + s + "s and ";
    }
}
