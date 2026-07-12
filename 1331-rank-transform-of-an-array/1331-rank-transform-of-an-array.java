class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] sorted_arr= arr.clone();
        Arrays.sort(sorted_arr);
        Map<Integer,Integer>map= new HashMap<>();
        for(int i:sorted_arr){
            map.putIfAbsent(i,map.size()+1);
        }
        for(int i =0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }return arr;
    }
}