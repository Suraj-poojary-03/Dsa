class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int n=x;
        while(x!=0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        if(n<0){
                return false;
            }
            if(reverse==n){
                return true;
            }
            
            
        return false;
    }
}