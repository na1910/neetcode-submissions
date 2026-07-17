class Solution {
    public int[] twoSum(int[] nums, int target) {
        // o(n) - using hashmap - key value pair
//[4,1,2,3], target -5
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int i =0;i<nums.length; i++){
            int j =  target - nums[i];
            if(map.containsKey(j))
         {  return new int[]{map.get(j), i};
         }
            //when map doesnt contain  the number then keep adding in it  with element and index
         map.put(nums[i],i);// wes store element and index
        }
        return new int[]{-1,-1};
    }
}
