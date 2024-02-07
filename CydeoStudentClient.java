package day_11_Class_and_Object_Part2;

public class CydeoStudentClient {
    public static void main(String[] args) {




        CydeoStudent st1 = new CydeoStudent("Paul", 34,33,'A',"45",4);

        System.out.println(st1);
        st1.isAttending();

        st1.study();
        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.programingLanguage);


    }
}
