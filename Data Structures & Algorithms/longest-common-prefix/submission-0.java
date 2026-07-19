class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i< strs[0].length();i++){
            for(String s: strs){

                if(i==s.length() ||s.charAt(i)!= strs[0].charAt(i)){
                    return s.substring(0,i);
                }
            }

        }
       return strs[0]; 
    }
}



// flower  flow flight
// s.char(0) ! =  flower.char(0)
// f!= f
