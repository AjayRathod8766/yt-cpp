abstract class absclass {
    String color;
    absclass(){
        System.out.println("abs constuctor iss called ....");
    }
    void eat(){
        System.out.println("eating....");
    }
    abstract void walk();
    
}
class horse extends absclass{
      horse(){
        System.out.println("horse constructor is called....");
    }
    void changecolor(){
        System.out.println("brown color...");
    }
    void walk(){
        System.out.println("horse have 4 legs");
    }
}
class Chicken extends absclass{
    void changecolor(){
        System.out.println("yellow...");
    }
    void walk(){
        System.out.println("Chicken have 2 legs");
    }
    //hierachical 
    class mustang extends Chicken {
         mustang(){
            System.out.println("mustang constructor is called ....");
        }
    }

public static void main(String[] args) {
    //mustang myhorse = new mustang();
}
}
