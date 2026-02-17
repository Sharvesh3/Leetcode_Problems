class Solution {
    public double findMaxAverage(int[] arr, int k) {
    int sum=0;
    for(int i=0;i<k;i++){
        sum+=arr[i];
    }
    int maxSum=sum;
    for(int i=k;i<arr.length;i++){
        sum+=arr[i];
        sum-=arr[i-k];
        maxSum=Math.max(maxSum,sum);
    }
    return (double) maxSum/k;
    }
}