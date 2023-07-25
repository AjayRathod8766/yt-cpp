public class exceptionhandle1 {
    //declaring and initializing string
    String name = "geeksforgeeks";

    //maIN driver method
    public static void main(String[] args) {
        //try block to check for exception 
        try {
            Class cls = Class.forName("exceptionhandle1");
            //creating object of main class
            //using intence method
            exceptionhandle1 obj = ( exceptionhandle1)cls.newInstance();
            //print and display
            System.out.println(obj.name);
            
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(InstantiationException e){
            e.printStackTrace();
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

