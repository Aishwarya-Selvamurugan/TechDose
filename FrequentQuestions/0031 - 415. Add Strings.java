class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        char a[] = num1.toCharArray();
        char b[] = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(l1 >= 0 || l2 >= 0 || carry == 1)
        {
            int n1 = (l1 >= 0 ? a[l1--]-'0':0);
            int n2 = (l2 >= 0 ? b[l2--]-'0':0);
            int res = n1+n2+carry;
            carry = res/10;
            sb.insert(0,res%10);
        }
        return sb.toString();
    }
}
