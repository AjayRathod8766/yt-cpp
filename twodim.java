import java.util.Scanner;

class twodim{
    public static boolean search(int arr[][], int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.print("key found at index :("+i+","+j+")");
                      return true;
                }
            }
            System.out.println();
        }
         System.out.println("key not found");
        return false;
    }
    public static void minmax(int arr[][]){
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("smallest element is "+min);
        System.out.println("largest element is "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, 5);
        minmax(arr);
    }
}