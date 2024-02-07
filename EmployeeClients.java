package day_11_Class_and_Object_Part2;

public class EmployeeClients {

    public static void main(String[] args) {



        Employee emp = new Employee();
        System.out.println(emp);
        System.out.println();
        Employee emp1 = new Employee("Valera");
        System.out.println(emp1);
        Employee emp2 = new Employee("Sveta", 28);
        System.out.println(emp2);
        Employee emp3 = new Employee("PAul",34,'M');
        System.out.println(emp3);

        Employee emp4 = new Employee("Mike", 33,'M',"SDET");
        System.out.println(emp4);
        System.out.println();
        Employee emp5 = new Employee("Sergii",49,'F',"Contractor",120_000);
        System.out.println(emp5);

        emp5.work();

    }
}
