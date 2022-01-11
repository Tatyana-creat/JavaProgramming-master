package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    class class1{

    }

    public static int num =100;
    public static void method(){

    }
    static{

    }

}

class A{//outer class

   static  class B{  //  inner class .( static keyword  ----> belongs to the class B belongs to A

       public static void methode1(){

       }

    }
}
class C{
    public static void main(String[] args) {

    }
}
