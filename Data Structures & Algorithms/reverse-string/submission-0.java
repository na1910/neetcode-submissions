class Solution {
    public void reverseString(char[] s) {
        //t-O(n) S=1
        // l,r=0,len(S)-1
        // while l<r:
        // s[r],s[l]= s[l],s[r]
        // v,r=l+1,r-1

        // stack = []
        // for c in s:
        // stack.append(c) simply add fifo method
        //  i=0
        //  while stack:
        //  s[i]= stack.pop()
        // i+=1
          int l = 0, r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}