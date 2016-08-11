import java.util.HashMap;

public class IsUnique {
    /*
        Given a string, determine if the string has all unique characters.

        FOLLOW UP: What if no additional data structures are allowed?
     */

    //Using hashmap
    boolean isUnique(String s1) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        char[] charS1 = s1.toCharArray();

        for (char s : charS1) {
            if (hm.containsKey(s)) {
                return false;
            } else {
                hm.put(s, 1);
            }
        }

        return true;
    }

    //Using no additional data structures, i.e. create an array of boolean values with each character mapping to an index
    boolean isItUnique(String s1) {
        if (s1.length() > 128) {
            return false;
        }

        boolean[] usedChars = new boolean[128];

        for (char s : s1.toCharArray()) {
            if (usedChars[(int) s]) {
                return false;
            } else {
                usedChars[(int) s] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique iu = new IsUnique();
        System.out.println(iu.isUnique("abcde"));
        System.out.println(iu.isUnique("abace"));

        System.out.println(iu.isItUnique("abcde"));
        System.out.println(iu.isItUnique("abace"));

    }
}
