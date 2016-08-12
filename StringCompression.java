public class StringCompression {

    /*
        CTCI 1.6
        Basic string compression using the counts of repeated characters.
        If the compressed string would not be shorter than the original string, just return original string.
     */

    public String compress(String s) {

        StringBuilder compressedString = new StringBuilder();

        int charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            charCount++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedString.append(s.charAt(i));
                compressedString.append(charCount);
                charCount = 0;
            }
        }
        return compressedString.length() < s.length() ? compressedString.toString() : s;
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();

        System.out.println(sc.compress("aaabbbccc"));
        System.out.println(sc.compress("abc"));
        System.out.println(sc.compress("abababeeeeeeeeeeeeebbbbf"));

    }
}
