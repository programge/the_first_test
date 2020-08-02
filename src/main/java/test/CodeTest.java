package test;


import java.util.*;

/**
 * 在朋友的帮助下，使用队列方式进行题解。
 * 利用队列先进先出，将之前的字符串出队，拼接新的字符，新生成的字符串入队
 * 本来打算使用递归方式，但测试后发现当数字长度增大时，递归效率极其低下，十几位长度数字就无法工作
 * @author Darling秦瑞杉
 */
public class CodeTest {
    /**
     * 使用LinkedList，申请新空间方便，不会像ArrayList那样频繁扩容，
     * 在传入数组后会拼接成字符串以方便使用字符串的api
     * @param numbers 传入integer array，数组元素支持0到int最大支持任意数字
     * @return 返回link集合
     */
    public List<String> phone(int[] numbers) {
        LinkedList<String> ans = new LinkedList<String>();
        StringBuilder tempString = new StringBuilder();
        //遍历数组转化位string，防止出现负数
        for (int number : numbers) {
            assert number>=0;
            tempString.append(number);
        }
        String digits = tempString.toString();
        if(digits.isEmpty()) {
            ans.add("nothing at all");
            return ans;
        }
        //使用数组作为容器利用数组遍历迅速的特点，本考虑判断遇到0，1直接抛出异常，但不转换更好
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            assert ans.peek() != null;
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray()) {
                    ans.add(t+s);
                }
            }
        }
        return ans;
    }
}
