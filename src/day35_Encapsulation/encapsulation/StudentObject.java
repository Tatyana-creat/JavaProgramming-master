package day35_Encapsulation.encapsulation;

import day35_Encapsulation.encapsulation.Student;

public class StudentObject {
    public static void main(String[] args) {


        Student student1 = new Student("tanya", 27, 'F',
                'A', "CYD");
         student1.setAge(32);

        System.out.println(student1);


    }

}
