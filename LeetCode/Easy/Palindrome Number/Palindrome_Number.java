class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        int orig = x;
        if(x==0)
        {
            return true;
        }
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int rem = x % 10;
            n = n * 10 + rem;
            x = x / 10;
        }
        if (orig == n) {
            return true;
        } else {
            return false;
        }
    }
}