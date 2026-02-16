class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for (int num : nums){
            if(intSet.contains(num)){
                return true;

            }
            intSet.add(num);    //adding nums to hash set
        }
        return false;

    }
}
//solved 