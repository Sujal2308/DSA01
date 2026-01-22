//    https://leetcode.com/problems/reverse-words-in-a-string/

var reverseWords = function(s) {
    let arr = s.trim().split(" ");
    let str = "";
    for(let i = arr.length-1 ; i>=0 ; i--){
        if(arr[i]!=''){
            str = str+" "+arr[i];
        }
    }
    return str.trim();
};
