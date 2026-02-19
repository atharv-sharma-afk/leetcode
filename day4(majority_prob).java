class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==majority){      //increase vote if 1st num repeat 
                votes++;
            }
            else if(votes==0){          //if count ==0 then update majority to current element
                votes++;
                majority=nums[i];
            }
            else
            votes--;                    
        }return majority;
    }
}