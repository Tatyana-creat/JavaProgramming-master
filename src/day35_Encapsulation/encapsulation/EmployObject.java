package day35_Encapsulation.encapsulation;

public class EmployObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana",'F',34,12000);

        employee1.setAge(32);



     Employee employee2 = new Employee("Me",'M',32,115000);
     employee2.setName("Eduard");
     employee2.setSalary(employee2.getSalary() +150000);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
