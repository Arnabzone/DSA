class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,res=0;
        Set<Character> set =new HashSet();
        while(r<s.length()){
            //expand for new char
            if(!set.contains(s.charAt(r))){
                 set.add(s.charAt(r));
                 res= Math.max(res,r-l+1);
                 r++;
                } else{
                //already present
                set.remove(s.charAt(l));
                l++;}
        }
        return res;
    }
}