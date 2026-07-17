class Solution {
    public boolean hasDuplicate(int[] nums) {
// T(c) -->o(n) iterating through the loop only once
// spacw =  o(n) -- it contains only discitnct elements so wil take up n space
        Set<Integer> set = new HashSet<>();  // doesnt store duplicate values
        for( int num : nums){  //it will iterate  each number in array , add in set till its distinct
            if(set.contains(num))
            return true;
            set.add(num);
      
        }
      
           return false;
    }
}