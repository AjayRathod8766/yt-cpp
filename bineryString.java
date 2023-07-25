public class bineryString {
    public static int bineryString(int n, int i){
        int sol = 0;
        sol = bineryString(n - 1, 0);
        sol = sol + bineryString(n - 1, 1);

        return sol;
    }

    public static void main(String[] args) {
        System.out.println(bineryString(3, 0));
    }
}


