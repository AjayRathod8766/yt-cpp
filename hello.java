import java.util.Arrays;
class hello {
    public static void hollowrect(int totalrows, int totalcols){
        for(int i = 1; i <= totalrows; i++){
           for(int j = 1; j <= totalcols; j++){
           if(i == 1 || i == totalrows || j == 1|| j== totalcols){
            System.out.print("*");
           } else {
            System.out.print(" ");
           }
        }
        System.out.println();
    }

    }
    public static void invertedrotatedhalfpyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertednumberpyramid(int n){
        for(int i = 1; i <= n; i++){
         for(int j = 1; j <= n-i + 1; j++){
            System.out.print(j+" ");
         }
          System.out.println();
        }
        System.out.println();
       
    }
    public static void floydtriangle(int n){
        int counter =  1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroonetriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j)% 2== 0){
                   System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    public static void printsubarr(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                    if(max < arr[i]){
                        max = arr[i];
                    }
                    if(min > arr[i]){
                        min = arr[i];
                    }
                }
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("sum is "+sum);
        System.out.println("max value "+ max);
        System.out.println("min value "+min);
    }
    public static void bubblesort(int arr[]){
        int swaps = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("swaps count "+swaps);
    }
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void inbuitlsort(int arr[]){
         Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {8, 5, 2, 4, 9, 1};
       // hollowrect(4, 4);
       // invertedrotatedhalfpyramid(5);
      // invertednumberpyramid(5);
      //  floydtriangle(5);
     // zeroonetriangle(5);
     //printsubarr(arr);
    // bubblesort(arr);
     inbuitlsort(arr);
    }

}