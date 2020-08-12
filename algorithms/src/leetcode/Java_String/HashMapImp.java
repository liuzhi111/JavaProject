//package leetcode.Java_String;
//
//import java.util.HashMap;
//import java.util.Stack;
//
///**
// * @description: hashmap的相关实现
// * @author: liuzhi
// * @Date: 2020-08-09 20:15
// **/
//public class HashMapImp {
//    private HashMap<Character, Character> mappings;
//    public HashMapImp()
//    {
//        this.mappings = new HashMap<Character, Character>();
//        this.mappings.put('(',')');
//        this.mappings.put('[',']');
//        this.mappings.put('{','}');
//    }
//
//    public boolean isValid(String s) {
//
//        Stack<Character> st = new Stack<Character>();  //栈存放字符
//        Boolean istrue = true;
//        for (int i = 0; i < s.length(); i++) {   //循环判断是否有效
//            char c = s.charAt(i);
//
//            if (this.mappings.containsKey(c)) {
//                char topElement = st.empty() ? '#' : st.pop();
//                if (topElement != this.mappings.get(c)) {
//                    return false;
//                }
//            } else
//                st.push(c);
//        }
//        return st.empty();
//
//    }
//
//    public static void main(String[] args) {
//        String s = "(([]}}}}";
//        Boolean bool = HashMapImp::isValid(s);
//        System.out.print(bool);
//    }
//}
