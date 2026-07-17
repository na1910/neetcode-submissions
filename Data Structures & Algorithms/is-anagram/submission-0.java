
class Solution {
    public boolean isAnagram(String s, String t) {
    //     if(s.length()!= t.length()){ return false;}
    //            char[] a = s.toCharArray();
    //            char[] b = t.toCharArray();
    //        Arrays.sort(a);
    //        Arrays.sort(b)
    //   return Arrays.equals(a,b);


    // optimal approach -- O(n +m)
     if(s.length()!= t.length()){
        return false;  
          }
        int [] count = new int[26]; // lowercase 26 characters
        for(int i=0;i< s.length(); i++){
         count [ s.charAt(i) - 'a']++; // increase the count for characters 
          count[t.charAt(i) - 'a']--;
        } 
        //t.charAt(i) - 'a'. ==> char.characyter at i position. - 'a 97 value' ==> count[inside this will be ythe difference number]
        for (int c : count){
            if(c!= 0){
                return false;
            }
        }
        return true;
    }


}
