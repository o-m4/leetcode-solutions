class Solution {
    public boolean isPalindrome(int x) {
        boolean palin = false;
        int temp = x;
        int pali = 0;
        if (x < 0) {
            return false;
        }
        while(x!=0){
            int digit = x%10;
            pali = pali*10+digit;
            x = x/10; 
        }
        if(pali==temp){
            palin = true;
        }
        else{
            palin = false;
        }
        return palin;
    }
}