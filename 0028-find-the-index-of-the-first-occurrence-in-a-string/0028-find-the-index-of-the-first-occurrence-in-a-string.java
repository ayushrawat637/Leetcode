class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        int i=0;
        while(i < n) {
            int j=0;
            while(j<m && (i+j)<n && haystack.charAt(i+j)==needle.charAt(j)) {
                j++;
            }
            if(j==m) {
                return i;
            }
            if(i==n) {
                return -1;
            }
            i++;
        }
        return -1;
    }
}