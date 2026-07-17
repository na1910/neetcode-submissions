class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minimumHeap = new PriorityQueue<>();
        for(int num:nums){
            minimumHeap.add(num);     
        if(minimumHeap.size()>k){
            minimumHeap.remove();
        }
        }
    return minimumHeap.peek();
    
    }
// 1 2 3 
//   2 3 5
//     3 4 5 
//        4 5
}
//1 2 3 > 2