//https://leetcode.com/problems/number-of-1-bits/

class Solution {
    public int hammingWeight(int n) {
        int counter = 0;
        while(n>0){
            int binary = n % 2;
            if(binary==1){
                counter++;
            }
            n = n /2;
        }
        return counter;
    }
}
