class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // to have sorted array, largeer elements to be at the end 
        // i is last elemet of nums1 and j is last element of nums2 and k is the elememt we consider as zero
        // all will go in reveerse order - will check always if i>j then we willl set j i n ks place from end 
        // else will swt i till j>0 and i>0

int i= m-1;
int j= n-1;
int k = m+n-1;//total length -1 
while(j>=0){
    if(i>=0 && nums1[i]> nums2[j]){
        nums1[k]= nums1[i];//setting greater value at tht end
        k--;
        i--;
    }else{
        nums1[k]= nums2[j]; 
        k--;
         j--;
    }
    
}


    }
}