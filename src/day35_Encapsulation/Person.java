package day35_Encapsulation;

public class Person {

       // String name;    //default
       //  public static int age;  //all of them will have same age

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    } //this only for instance

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 1;
        numberOfWings = 0;

    }


    public static void printPlanetName(){        //call the method
        System.out.println("Planet name is  " + planet);
    }

    public void eat(String food){
        System.out.println(name+ "is eating " + food); //if its static we can't use instance name,age etk
    }

    public void drink(String drink){
        System.out.println(name+"is drinking "+drink);

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
2. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */