package easy.a3_palindrome_number;

/**
 * 回文数字
 * */
public class PalinDromeNumber {

    public boolean isPalindrome(int x) {
        int result = 0;
        int t = x;

        if ( t < 0 ) { return  false; }

        if ( t == 0 ) { return true; }

        while (t != 0 ) {
            int o = t % 10;
            t = t/10;
            result = 10 * result + o;
        }

        return x == result;

    }

    public static void main(String[] args) {
        PalinDromeNumber t = new PalinDromeNumber();
        System.out.println(t.isPalindrome(1));
    }
}
