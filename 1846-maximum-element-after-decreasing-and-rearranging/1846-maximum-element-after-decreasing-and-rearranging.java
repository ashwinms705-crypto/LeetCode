class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        int prev=arr[0];
        if(arr.length==1) return arr[0];
        for(int i=1;i<arr.length;i++){
            if(prev<arr[i]){
                arr[i]=prev+1;
            }
            prev=arr[i];
        }
        return arr[arr.length-1];
    }
}