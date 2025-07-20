class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String merge= s+s;
        return merge.contains(goal);
    }
}