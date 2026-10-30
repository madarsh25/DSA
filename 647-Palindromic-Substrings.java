class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++){
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)){
                count++;
                low--;
                high++;
                if (low == -1 || high == s.length()){
                    break;
                }
            }

            low = i - 1;
            high = i;

            while (s.charAt(low) == s.charAt(high)){
                count++;
                low--;
                high++;
                if (low == -1 || high == s.length()){
                    break;
                }
            }
        }
        return count + 1;
    }
}