class kadanes{
    public static void kadnesalgorithms(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i = 0; i <= arr.length-1;i++){
           currsum += arr[i];
            
             if(currsum < 0){
                currsum = 0;
        }
    }
        maxsum = Math.max(maxsum, currsum);
        System.out.println("maxsum is "+maxsum);
      // return maxsum;
    }
    public static int maximumSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];
        

            if (currSum > maxSum) {
            maxSum = currSum;
            }

            if (currSum < 0) {
            currSum = 0;
            }
        }

        return maxSum;
    }
    public static int trappingrainwater(int height[]){
        int n = height.length;
        //left max boundary array
        int leftmax[]= new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        //right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n - 2; i >=0; i--){
            rightmax[i] = Math.max(height[i], leftmax[ i + 1]);
        }
        int trappedwater = 0;
        for(int i = 0; i < n - 1;  i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
      

    }
    public static int buysellstock(int prizes[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i < prizes.length; i++){
            if(buyprice < prizes[i]){
            int profit = prizes[i] - buyprice;
            maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prizes[i];
            }
        }
        System.out.println(maxprofit);
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[] ={7 , 1, 5, 3, 6, 4};
      // System.out.println(trappingrainwater(arr));
       kadnesalgorithms(arr);
      
       //trap(arr);
      //buysellstock(arr);
    }
}