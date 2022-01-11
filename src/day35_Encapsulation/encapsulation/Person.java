package day35_Encapsulation.encapsulation;

 public class Person {

   private  String name; //uniq instance variable "tanya" "Vala"
   private  int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;      // assign  to a new variable name
    }


    public  int getAge(){
        return age;
    }

     public void setAge(int age){  // u can give a condition  when u set private
        if (age<=0 || age > 150){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }

        this.age = age;
    }


}
