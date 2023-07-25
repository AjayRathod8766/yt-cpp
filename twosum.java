class twosum{
    public int[] twosum(int arr[], int target){
        for(int  i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
         return new int[] {};
    }
    
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
    
    }
}