package easy.a12_count_and_say;

import java.util.HashMap;
import java.util.Map;

public class CountAndSay {
    public String countAndSay(int n) {
        String s = "1";
        int t = 1;
        while (t < n) {
            char[] chars = s.toCharArray();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < chars.length;) {
                char valuei = chars[i];
                int num = 0;

                for (int j = i; j < chars.length; ) {
                    char valuej = chars[j];
                    i = ++j;
                    if (valuei == valuej) {
                        num ++;
                    } else {
                        i = --j;
                        break;
                    }
                }
                sb.append(num).append(valuei);
            }
            s = sb.toString();
            t++;
        }
        return s;
    }


    public static void main(String[] args) {
        CountAndSay t = new CountAndSay();
        for (int i = 1; i <= 10; i++) {
            System.out.println("输出"+ i +"对应的值为：" + t.countAndSay(i));
        }


    }
}
