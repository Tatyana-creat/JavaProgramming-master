package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("main method ");

    }
       static {
           System.out.println("static"); // runs first and runs only one time
       }
}
