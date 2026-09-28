class Solution {
    public int findPeakElement(int[] arr) {
        int i=0;
        int n=arr.length;
        if(n == 1)  return 0;
        if(arr[0] > arr[1]) return 0; //Acc. to the ques. 0 ke left index pe -infinty assume kiya hai
        if(arr[n-1] > arr[n-2]) return n-1; //Acc. to the ques. n-1 ke right index pe -infinty assume kiya hai
        int low=1;  int high=n-2;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])  return mid;
            else if(arr[mid] > arr[mid-1])  low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
