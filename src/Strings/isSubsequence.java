// https://leetcode.com/problems/is-subsequence/
// Approach - 2pointer
// SC: 0(1) and TC : O(n)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer = 0;
        if(s.length()==0){
            return true;
        }
        for(int  i = 0; i<t.length() ; i++){
            if(t.charAt(i) == s.charAt(pointer)){
                pointer++;
            }
            if(pointer==s.length()){
                return true;
            }
        }
        return false;
    }
}
