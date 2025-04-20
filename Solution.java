class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
       int count=0;
        for(int n : arr){
            int temp=n;
            int rev=0;
            
            while(n!=0){
            int rem = n %10;
            
             rev = rev*10 +rem;
            n=n/10;
            }
            if(rev==temp)
             count++;
        }
        if(count == arr.length)
        return true;
    return false;
    }
}