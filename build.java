 class build{
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) ==' ' && i >  str.length()-1){
                sb.append(str.charAt(i));
                i++;
            } else {  
                sb.append(Character.toUpperCase(str.charAt(i)));   
            }  
        }
        return sb.toString();
    }
    public static void swap(){
        int a = 4, b = 8;

        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(" a = "+a);
        System.out.println("b = "+b);
    }
    public static int setBit(int n) {
        n |= (n >> 1);
        n |= (n >> 2);
        n |= (n >> 4);
        n |= (n >> 8);
        n |= (n >> 16);
        n++;
        n >>= 1;
        return n;
      }
    public static void main(String[] args) {
        //String str = "hi i am ajay";
        //System.out.println(toUppercase(str));
        //swap();
        System.out.println(setBit(5));
    }
}