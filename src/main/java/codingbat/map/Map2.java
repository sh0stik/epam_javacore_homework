package codingbat.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Map2 {
    /*Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
     always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting
     later, but for this problem the value is simply 0.*/
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, 0);
        }
        return map;
    }

    /*Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
     and the value is that string's length.*/
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, string.length());
        }
        return map;
    }

    /*Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add
    its first character as a key with its last character as the value.*/
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String key = "" + string.charAt(0);
            String value = "" + string.charAt(string.length() - 1);
            map.put(key, value);
        }
        return map;
    }

    /*The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key
    for each different string, with the value the number of times that string appears in the array.*/

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                int count = map.get(string);
                map.put(string, count + 1);
            }
        }
        return map;
    }

    /*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.*/

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (String string : strings) {
            if (map.get(string.substring(0, 1)) != null) {
                String tail = map.get(string.substring(0, 1)) + string;
                map.put(string.substring(0, 1), tail);
            } else {
                map.put(string.substring(0, 1), string);
            }
        }
        return map;
    }

    /*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd,
4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string
appears a 2nd time.*/

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (String currentString : strings) {
            int i = 0;
            if (map.containsKey(currentString)) {
                i = map.get(currentString) + 1;
                map.put(currentString, i);
                if (i % 2 == 0) {
                    result = result + currentString;
                }
            } else {
                map.put(currentString, i + 1);
            }
        }
        return result;
    }

    /*Given an array of strings, return a Map<String, Boolean> where each different string is a key and
     its value is true if that string appears 2 or more times in the array.*/

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String currentString : strings) {
            if (map.containsKey(currentString)) {
                map.put(currentString, true);
            } else {
                map.put(currentString, false);
            }
        }
        return map;
    }

    /*We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows: if a string matches
    an earlier string in the array, swap the 2 strings in the array. When a position in the array
    has been swapped, it no longer matches anything. Using a map, this can be solved making just
    one pass over the array. More difficult than it looks.*/

    public String[] allSwap(String[] strings) {
        String[] result=new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c  = strings[i].charAt(0);
            if (map.containsKey(c))
            {
                int p=map.get(c);
                map.remove(c);
                result[i]=result[p];
                result[p]=strings[i];
            }
            else
            {
                result[i]=strings[i];
                map.put(c,i);
            }
        }
        return result;
    }

    /*We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows: if a string matches
    an earlier string in the array, swap the 2 strings in the array. A particular first char can
    only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map,
    this can be solved making just one pass over the array. More difficult than it looks.*/

    public String[] firstSwap(String[] strings) {
        String[] result=new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c  = strings[i].charAt(0);
            if (map.containsKey(c)&&map.get(c)>=0)
            {
                int p=map.get(c);
                map.put(c,-1);
                result[i]=result[p];
                result[p]=strings[i];
            }
            else
            {
                result[i]=strings[i];
                if (!map.containsKey(c))
                    map.put(c,i);
            }
        }
        return result;
    }
}