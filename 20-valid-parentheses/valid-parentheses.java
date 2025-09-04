import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char i: s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
            st.push(i);}
            else{
                if(st.isEmpty()) return false;
                char c=st.pop();
                if ((i == ')' && c != '(') ||
                    (i == '}' && c != '{') ||
                    (i == ']' && c != '[')) {
                    return false;
            }
        }
    }
    return st.isEmpty();
}
}