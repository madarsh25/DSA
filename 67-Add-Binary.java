class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0){

            int num1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int num2 = (j >= 0) ? b.charAt(j) - '0' : 0;

            if (num1 == 0 && num2 == 0){
                if (carry == 1){
                    res.append("1");
                    carry = 0;
                }else{
                    res.append("0");
                }
            }else if (num1 == 1 && num2 == 1){
                if (carry == 1){
                    res.append("1");
                    carry = 1;
                }else{
                    res.append("0");
                    carry = 1;
                }
            }else if ((num1 == 0 && num2 == 1) || (num1 == 1 && num2 == 0)){
                if (carry == 1){
                    res.append("0");
                    carry = 1;
                }else{
                    res.append("1");
                }
            }
            
            j--;
            i--;
        }

        if (carry == 1) res.append("1");

        return res.reverse().toString();
    }
}