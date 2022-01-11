package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); default is not visible outside the package
       // System.out.println(AccessModifiers.privateDate ); privet not visible outside the class only in a class where u creat

        AccessModifiers.method1();
        //AccessModifiers.method2();
       // AccessModifiers.method3();

    }
}
  





