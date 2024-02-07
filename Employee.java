package day_11_Class_and_Object_Part2;

public class Employee {

/*
Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.


 */
    public String name;
    public int age ;
    public char gender;
    public String jobTitle;
    public double salary;




    public void work(){
        System.out.println(jobTitle + " " + name + " is working");

    }
    public Employee(){

    }
    public Employee(String name){
        this.name = name;

    }public Employee(String name, int age){
        this(name);
        this.age = age;

    }public Employee(String name, int age, char gender){
        this(name,age);
        this.gender = gender;
    }public Employee(String name, int age, char gender, String jobTitle){
        this(name,age,gender);
        this.jobTitle = jobTitle;

    }public Employee(String name, int age, char gender, String jobTitle, double salary){
        this(name,age,gender,jobTitle);
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
