public class leetcode150 { 
    public static void rotatearr(int arr[], int k) {
    if(k == 0){
    return;
}
int n = arr.length;

k = k % n;
reverse(arr , 0 , k-1);
reverse(arr , k , n-1);
reverse(arr , 0 , n-1);

}
    public static void reverse(int arr[], int start, int end){
    while(start < end){
    int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
}
}
public static void printarr1(int arr[]){
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

//other
}
public static void rotatearr2(int nums[], int k){
     int n = nums.length;
       int p = 0;
       while(p <= k){
           int last = nums[0];
           for(int i = 0; i < n - 1; i++){
               nums[i] = nums[i+1];
    
           }
           nums[n-1] = last;
           p++;
       }
    
}

public static void main(String[] args) {
    int arr[] = {3, 4, 1, 2, 5, 7};
    int k = 1;
     rotatearr2(arr, k);
    //rotatearr(arr, k);
    printarr1(arr);
   
}
}
