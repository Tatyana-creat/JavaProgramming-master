package day37_SuperKeywor_OfInheritaince.animalTask;

public class AnimalObject {

    public static void main(String[] args) {
        Dog dog1 = new Dog("alex", "husky", 'M', 1, "small", "gray");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Kiki", "British", 'F', 3, "medium", "white");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();


    }
}