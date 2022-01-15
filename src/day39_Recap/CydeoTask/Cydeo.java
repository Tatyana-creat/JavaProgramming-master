package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Eduard",31,'M',11,"developer",140000);

        Tester tester = new Tester("Tatana",39,'F',21,"QA",120000);

        Teacher teacher = new Teacher("Julia",31,'F',26,"math",110000);

        Student student = new Student("Veronica",7,'F', 33,"student");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("-----------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("---------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBags();

        System.out.println("---------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.creatTicket();

        System.out.println("----------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("----------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();




    }


}
