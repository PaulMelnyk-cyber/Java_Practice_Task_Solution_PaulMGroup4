package day_11_Class_and_Object_Part2;

public class CydeoStudent {

    /*
    Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.


     */
    public String name;
    public int age;
    public char grade;
    public int ID;
    public String batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programingLanguage;



    public CydeoStudent(String name, int age, int id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.ID = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studing");
    }
    public void isAttending(){
        System.out.println(name + " is attending the class");
    }public void printSchoolName(){
        System.out.println(schoolName);
    }public void printProgrammingLanguage(){
        System.out.println(programingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
