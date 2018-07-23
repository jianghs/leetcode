package easy.a2_reverse_integer;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * */

public class ReverseInteger {


    public int reverse(int x) {
        try {
            int val = x;

            if (x < 0) {
                val = -x;
            }

            String str = String.valueOf(val);
            char[] arr = str.toCharArray();

            String result = "";
            boolean tZeroflag = false;
            for (int i = arr.length - 1; i >= 0; i--) {
                // 如果值为0，且 这个0是最开始的值，则不拼接
                if (i == arr.length - 1 && !String.valueOf(arr[i]).equals("0")) {
                    tZeroflag = true;
                }
                if (String.valueOf(arr[i]).equals("0") && !tZeroflag) {
                    tZeroflag = true;
                    continue;
                }
                result += arr[i];
            }
            if ("".equals(result)) {
                return 0;
            }
            return x < 0 ? -Integer.parseInt(result) : Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {return 0;}
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {return 0;}
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger t = new ReverseInteger();
        int a = -1321;
        System.out.println(t.reverse1(a));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

}
