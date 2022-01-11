package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String SchoolName;

    public CydeoStudent(String studentName){
        this.studentName=studentName;
        SchoolName ="Cydeo School";
    }

    static {
        SchoolName="Cydeo School";

    }

}
class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println(student1.SchoolName);
        System.out.println(student2.SchoolName);

    }

}