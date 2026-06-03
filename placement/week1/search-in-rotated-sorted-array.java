class Solution {
    public int search(int[] nums, int target) {
        int h1=0;
        int h2=nums.length-1;
        int l1=0;
        int l2=0;
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                h1=i;
                l2=i+1;
            }
            
            for(int j=l1;j<=h1;j++){
                if(nums[j]==target){
                    return j;
                }else if(nums.length==1){
                    return 0;
                 }else
                 {
                    l1=l2;
                    h1=h2;
                }
            }
        }return -1;
    }
}