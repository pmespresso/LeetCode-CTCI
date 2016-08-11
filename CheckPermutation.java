public class CheckPermutation {

    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        // Assuming s1 and s2 are ASCII
        int[] letters = new int[128];

        // for each char in s1, increment that index in letters[],
        // since each char also maps to an integer
        for (int i = 0; i < s1.length(); i++) {
            int letter = (int) s1.charAt(i);
            letters[letter]++;
        }

        // now decrement each letter in s2 from letters[] till either one index goes
        // below 0 or all s2's characters have been used.
        for (int i = 0; i < s2.length(); i++) {
            int letter = (int) s2.charAt(i);
            letters[letter]--;

            if (letters[letter] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPermutation cp = new CheckPermutation();

        System.out.println(cp.isPermutation("ata", "taa"));
        System.out.println(cp.isPermutation("pika", "apik"));
        System.out.println(cp.isPermutation("allah", "lalbh"));
    }
}
