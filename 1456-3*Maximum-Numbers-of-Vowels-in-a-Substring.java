class Solution {
    public int maxVowels(String s, int k) {
        char[] str = s.toCharArray();
        int ans = 0;
        int vowels = 0;
        for (int i = 0; i < str.length; i++){
            if (str[i] == 'a' || str[i] == 'e'|| str[i] == 'i' || str[i] == 'o'|| str[i] == 'u'){
                vowels++;
            }

            int left = i - k + 1;
            if (left < 0){
                continue;
            }
            ans = Math.max(ans, vowels);
            if (str[left] == 'a' || str[left] == 'e'|| str[left] == 'i' || str[left] == 'o'|| str[left] == 'u'){
                vowels--;
            }
        }
        return ans;
    }
}