package easy.a5_longest_common_prefix;

import java.util.*;

/**
 *Write a function to find the longest common prefix(字首) string amongst an array of strings.
 *
 *If there is no common prefix, return an empty string "".
 * */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String result = "";
        List<String> keyList = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < strs.length ;i++) {
            keyList.add(strs[i]);
            values.add(strs[i].length());
        }

        // 获取最短的字符串长度
        int min = 0;
        for (int i = 0; i < values.size(); i++) {
            if (i == 0) {
                min = values.get(i);
                continue;
            }
            if (min > values.get(i)) {
                min = values.get(i);
            }
        }

        if (min == 0) {return result;}

        Set<String> resultSet;
        int index = 0;
        for (int i = 0; i < min; i++) {
            resultSet = new HashSet<>();
            Iterator<String> it = keyList.iterator();
            while (it.hasNext()) {
                String val = it.next();
                val.substring(0,i);
                resultSet.add(val.substring(0,i+1));
            }

            if (resultSet.size() > 1) {
                break;
            }
            index++;
        }
        System.out.println("index:" + index );
        result = keyList.get(0).substring(0,index);
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix test = new LongestCommonPrefix();
        String[] strs = {"a","b","c"};
        System.out.println(test.longestCommonPrefix(strs));
    }
}
