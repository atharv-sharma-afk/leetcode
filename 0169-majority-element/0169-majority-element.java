class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num,count);

            if(count >majority){
                return num;
            }


        }return 0;
        
    }
}