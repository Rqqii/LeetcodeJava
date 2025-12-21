class Solution {
    public boolean containsDuplicate(int[] nums) {

        // method 1: loop and check
        // time complexity O(n^2)
        // method 2: sorting and compare the value with the next one
        // time complexity O(nlogn)

        // method 3: keep track and could access quickly => HashSet
        // time complexity O(n) space complexity O(n)

        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            if (seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}