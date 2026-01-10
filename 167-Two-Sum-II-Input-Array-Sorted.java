class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target){
                return new int[]{left+1, right+1};
            }
            if (sum > target){
                right--;
            } else{
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}

// Time:
// python
//class Solution:
//def twoSum(self, numbers: List[int], target: int) -> List[int]:
//left = 0
//right = len(numbers) - 1
//        while left < right:
//sum = numbers[left] + numbers[right]
//        if sum == target:
//        return [left + 1, right + 1]
//        if sum < target:
//left += 1
//        else:
//right -= 1