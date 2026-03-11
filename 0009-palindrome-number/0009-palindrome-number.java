class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
        int rem;

        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if (original==rev) return true;
        else return false;
    }
}