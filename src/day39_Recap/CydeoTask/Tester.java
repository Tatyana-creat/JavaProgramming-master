package day39_Recap.CydeoTask;

   public class Tester extends Employee {

       public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
           super(name, age, gender, employeeID, jobTitle, salary);
       }

       public  void creatTicket(){
           System.out.println(getJobTitle()+" "+getName()+"is creating ticket");

  }

       @Override
       public void work() {
           System.out.println(getJobTitle()+" "+"is testing the application");
       }
   }
/*
 Override the work method

            Extra methods:
                createTicket()
 */