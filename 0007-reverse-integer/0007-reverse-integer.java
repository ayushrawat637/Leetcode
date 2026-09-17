class Solution {
    public int reverse(int x) {
        long l = reverseHelper(x,0);
        if(l>Integer.MAX_VALUE || l< Integer.MIN_VALUE) return 0;
        return (int)l;
    }
    public static long reverseHelper (int n, long r) {
        if (n == 0) return r;
        return reverseHelper(n / 10, r * 10 + n % 10);
    }
}