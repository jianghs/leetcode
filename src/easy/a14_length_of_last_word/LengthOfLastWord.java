package easy.a14_length_of_last_word;

/**
 * Input: "Hello World"
 * Output: 5
 * */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if ("".equals(s)) {
            return 0;
        }
        char[] stringchars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringchars.length; i++) {
            sb.append(stringchars[i]);
            if (stringchars[i] == ' ') {
                sb = new StringBuilder();
            }
        }
        return sb.length();
    }

    public int lengthOfLastWord2(String s) {
        if ("".equals(s)) {
            return 0;
        }
        String[] ss = s.trim().split(" ");
        return ss[ss.length - 1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord main = new LengthOfLastWord();
        System.out.println(main.lengthOfLastWord("Hello World"));
    }
}
