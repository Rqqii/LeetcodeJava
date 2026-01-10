class Solution {
    public int characterReplacement(String s, int k) {

        //burte force
        // sliding window + 2pt

        // valid = length - most occurance <= k
        // Time O(n) (O(26*n)) Space O(26) (O(1))

        int[] occurance = new int[26];
        int left = 0, int right = 0;
        int ans = 0;
        int maxOccurance = 0;
        for (int right; right < s.length(); right ++){
            maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);
            if(right - left + 1 - maxOccurance > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;

    }
}