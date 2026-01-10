class Solution {
    public int[] twoSum(int[] nums, int target) {

        // method 1: if iterate through every int, time complexity is O(n^2)
        // method 2: sorting and binary search, time complexity = O((nlogn) + log(n))
        // method 3: hashmap time complexity = O(n) space complexity = O(n)

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
