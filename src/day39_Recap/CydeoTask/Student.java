package day39_Recap.CydeoTask;

public class Student extends Person{


    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    private  int studentID;
    private  String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }


    public void study(){

    }

    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*
 Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */