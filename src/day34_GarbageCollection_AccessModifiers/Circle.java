package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers = new ArrayList<>();




    //public static Sheet sheet; 1. read file 2. get sheet 3. stored int he variable 4. //before u set them
  // u need block of cod u need static


    public Circle(double radius) {
        this.radius = radius;
        // pi=4.14;
    }


    static {  // except  only static , can be use out of this class Circle
        pi=3.14;
        name="Circle";

        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    /*public static void main(String[] args) {
    pi =3.14;
    name="Circle";
    numbers
    */
}





