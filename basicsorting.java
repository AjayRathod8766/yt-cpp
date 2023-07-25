class basicsorting{
    public static void bubblesort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] = {7 , 6, 9, 8, 2, 1};
          
        bubblesort(arr);
         printarr(arr);
      
    }
}