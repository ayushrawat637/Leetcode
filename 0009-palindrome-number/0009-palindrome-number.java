class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        for(int i=x; i>0; i=i/10) {
            int p = i%10;
            sum=sum*10 + p;
        }
        if(sum==x)  return true;
        else return false;
    }
}