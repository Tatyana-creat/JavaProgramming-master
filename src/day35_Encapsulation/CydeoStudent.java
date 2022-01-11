package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }


    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden spoon";
    }

    public static void printSchoolName() {
        System.out.println("school is " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("secretCode" + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }

    public void study(){
        System.out.println(name + " is studying.");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}



/*
 2. create a class named CydeoStudent
            Variables:
            name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();   static
                printSecretCode();   static
                attendClass():       instance
                study()              instance
                toString()           generate
 */