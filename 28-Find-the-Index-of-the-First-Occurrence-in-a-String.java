class Solution {
    public int strStr(String txt, String pat) {
        if (txt.length() < pat.length()) return -1;

        for (int i = 0; i < txt.length() - pat.length() + 1; i++){
            if (txt.charAt(i) == pat.charAt(0)){
                if (txt.substring(i, i + pat.length()).equals(pat)){
                    return i;
                }
            }
        }

        return -1;
    }
}