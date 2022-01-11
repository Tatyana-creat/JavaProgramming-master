package day37_SuperKeywor_OfInheritaince.animalTask;

public class Parrot  extends Animal{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
       // this. if extra
    }
    public void sing(){
        System.out.println(name + "is singing ");
    }
}
