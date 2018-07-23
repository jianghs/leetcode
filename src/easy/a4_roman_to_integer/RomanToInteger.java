package easy.a4_roman_to_integer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 罗马数字转成整型
 * */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> dic = new HashMap<>();
        dic.put("I",1);
        dic.put("V",5);
        dic.put("X",10);
        dic.put("L",50);
        dic.put("C",100);
        dic.put("D",500);
        dic.put("M",1000);
        dic.put("IV",4);
        dic.put("IX",9);
        dic.put("XL",40);
        dic.put("XC",90);
        dic.put("CD",400);
        dic.put("CM",900);

        char[] arr = s.toCharArray();
        List<String> arrList = new ArrayList<>();
        for (int i = 0;i < arr.length; i++) {
            arrList.add(String.valueOf(arr[i]));
        }

        int result = 0;
        for (int i = 0;i < arrList.size(); i++) {
            if (i == arrList.size() - 1) {
                result += dic.get(arrList.get(i));
                continue;
            }
            if (dic.containsKey(arrList.get(i) + arrList.get(i+1))) {
                result += dic.get(arrList.get(i) + arrList.get(i+1));
                i++;
                continue;
            }
            if (dic.containsKey(arrList.get(i))) {
                result += dic.get(arrList.get(i));
                continue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger test = new RomanToInteger();
        System.out.println(test.romanToInt("MCMXCIV"));
    }
}
