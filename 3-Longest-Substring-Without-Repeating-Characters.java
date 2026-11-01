class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int left = 0;
        int right = 0;
        int max = 0;

        while (left <= right && right < s.length()){
            char ch = s.charAt(right);

            if (hash[ch] != -1){
                if (hash[ch] >= left){
                    left = hash[ch] + 1;
                }
            }

            int count = right - left + 1;
            max = Math.max(max, count);

            hash[ch] = right;
            right++;
        }
        return max;
    }
}