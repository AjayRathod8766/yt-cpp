public class Recursion {
    // printing numbers in decring order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    // printing numbers in ascending order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");
    }

    // factorial of n numbers
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // sum of n naturel numbers
    public static int printsum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = printsum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // printing fibonncci series
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    // check given array is sorted
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // find the firstoccurance an element of array
    public static int firstoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurance(arr, key, i + 1);
    }

    // finding the lastoccurance of an array element
    public static int lastoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurance(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    // print x to the power n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;

    }

    // printing x to the power n (optimized)
    public static int optimizedpower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedpower(a, n / 2);
        int halfpowersq = halfpower * halfpower;

        // n is odd
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    // tileing farsh problem
    public static int tilingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilingproblem(n - 1);
        int fnm2 = tilingproblem(n - 2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }

    // removeing duplicates from string
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx + 1, newstr.append(currchar), map);
        }
    }

    // friends pairing problem
    public static int friendspair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // int fnm1 = friendspair(n - 1);
        // //pair
        // int fnm2 = friendspair(n - 2);

        // int pairways = (n - 1) * fnm2;
        // //total pairs
        // int totalpairs = fnm1 * pairways;
        // return totalpairs;
        return friendspair(n - 1) + (n - 1) * friendspair(n - 2);
    }

    // printing binery string
    public static void printBinString(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinString(n - 1, 0, str + "0");

        if (lastplace == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }
    // print all binery strings of size n without consecutive

    public static void main(String[] args) {
        int n = 5;
        // int arr[] = {1, 2, 3, 4,5, 6, 3, 5, 8};
        // String str = "appnncollege";
        // int n = 6;
        // printDec(n);
        // printInc(n);
        System.out.println(fact(n));
        // System.out.println(printsum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstoccurance(arr, 5, 0));
        // System.out.println(lastoccurance(arr, 5, 0));
        // System.out.println(power(2, 10));
        // System.out.println(optimizedpower(2, 10));
        // System.out.println(tilingproblem(4));
        // removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
        // System.out.println(friendspair(4));
        // printBinString(4, 0, "");
    }
}
