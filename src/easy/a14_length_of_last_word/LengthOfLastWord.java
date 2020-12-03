package easy.a14_length_of_last_word;

/**
 * Input: "Hello World"
 * Output: 5
 * */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // 从右边出现最后一个字母的位置
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {
            right --;
        }

        int left = right;
        while (left >= 0 && s.charAt(left) != ' ') {
            left --;
        }

        return right - left;
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
        System.out.println(main.lengthOfLastWord("a cccfgg "));
    }
}
