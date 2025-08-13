class Solution {
    public boolean isPalindrome(int x) {
        int last_digit = 0;
        int rev = 0;
        int dup = x;
        while(x>0){
            last_digit = x%10;
            rev = (rev*10) + last_digit;
            x = x/10;
        }
        if (dup == rev){
            return true;
        }
        else{
            return false;
        }
    }
}
