class Solution {
    public int jump(int[] nums) {
        // int finalPosition= nums.length-1;
        // int jump=0;
        // for(int i = nums.length-2;i>=0;i--){
        //     if(finalPosition<=nums[i]+i){
        //         jump++;
        //     }
        // }return jump;
        int jump=0;
        int currentEnd=0;
        int farthest=0;
        if(nums.length<=0) return 0;
        for (int i =0;i<nums.length-1;i++){
            farthest= Math.max(farthest,nums[i]+i);

            if(i==currentEnd){
                currentEnd=farthest;
                jump++;
                

                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }return jump;
    }
}