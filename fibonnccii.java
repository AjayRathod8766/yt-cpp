public class fibonnccii {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        } 
        int sum = fib(n - 1) + fib(n - 2);
            return sum;
    
    }
    public static void printIncr(int n){
        if( n == 0){
            //System.out.println(1);
            return;
        }
         printIncr(n - 1);
        System.out.println(n);
       
    }
    public static int printnatural(int n){
        if(n == 1){
            return 1;
        }
        int snml = printnatural(n - 1);
        System.out.println("fun "+printnatural(n - 1));
        int sn = n + snml;
        return sn;
    }
    public static boolean isorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isorted(arr, i + 1);
    }
    public static int firstoccorance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccorance(arr, key, i + 1);
    }
    
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7,8};
        System.out.println(firstoccorance(arr, 4,0));
        //System.out.println(fib(8));
        //printIncr(10);
      // System.out.println(printnatural(5));
    }
}
