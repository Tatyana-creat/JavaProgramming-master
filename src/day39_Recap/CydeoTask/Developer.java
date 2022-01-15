package day39_Recap.CydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBags() {
        System.out.println(getJobTitle() + " " + getName() + "is fixing the bug");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the application");
    }


}


/*
  Override the work method

            Extra methods:
                fixingBugs()
 */