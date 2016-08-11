public class OneAway {
    /*
        CTCI 1.5
        There are three types of edits that can be performed on strings: insert, remove, or replace
        a character.
        Given two strings, write a function to check if they are one edit (or zero edits) away.

        EX
        pale, ple -> true
        pales, pale -> true
        pale, bale -> true
        pale, bae -> false
     */

    public boolean oneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return replacementCheck(s1, s2);
        } else if (s1.length() == s2.length() - 1) {
            return insertionCheck(s1, s2);
        } else if (s1.length() == s2.length() + 1) {
            return insertionCheck(s2, s1);
        }
        return false;
    }


    /*
        Returns true if the strings are one replacement away.
        False if it is more than one replacement.
     */
    boolean replacementCheck(String s1, String s2) {
        boolean foundDiff = false;

        for (int i = 0; i < s1.length(); i ++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDiff == true) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }


    /*
        Returns true if s1 is one insertion away from being equal to s2.
        s1 is the shorter string, and s2 is the longer string.
     */
    boolean insertionCheck(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }




    public static void main(String[] args) {
        OneAway oa = new OneAway();

        System.out.println(oa.oneAway("pale", "bale"));
        System.out.println(oa.oneAway("pale", "ple"));
        System.out.println(oa.oneAway("pales", "pale"));
        System.out.println(oa.oneAway("pale", "bae"));

    }
}
