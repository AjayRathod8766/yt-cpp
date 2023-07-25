public class SearchAlgo {
    public static int linearsearch(int arr[], int key ){
        for(int i= 0; i < arr.length; i++ ){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int binerysearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + end/2;
            if(arr[mid] == key){
                return mid;
            }
             if(arr[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] ={ 1, 5, 7,8, 4, 3, 2};
        int key = 2;
        System.out.println(binerysearch(arr, key));
       //\ System.out.println(linearsearch(arr, key));
    }
}
