package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person();

        p1.setName("Daniel");
        p1.setAge(45);

        p2.setName("Tatyana");
        p2.setAge(35);

        System.out.println(p1.getName()+" : "+p1.getAge());
        System.out.println(p2.getName()+" : "+p2.getAge());


    }
}
