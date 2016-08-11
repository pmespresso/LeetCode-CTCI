public class ReverseWordsInString {
    public String reverseWords(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] s_arr = s.trim().split(" ");

        for (int i = s_arr.length - 1; i >= 0; i--) {
            if (s_arr[i].length() > 0) {
                sb.append(s_arr[i].trim()).append(" ");
            }

        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }


    public static void main(String[] args) {
        String word = "   a   b ";

        ReverseWordsInString x = new ReverseWordsInString();

        System.out.println(x.reverseWords(word));

    }
}