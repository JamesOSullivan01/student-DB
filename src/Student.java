import java.util.Scanner;

public class Student {

    private String studentFirstName;
    private String studentLastName;
    private String studentId;
    private int gradeYear;
    private String courses;

    private int tuitionBalance;
    private static int costOfCourse;
    private static int id = 1000;


    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student first name");
        this.studentFirstName = scanner.nextLine();
        System.out.println("Please enter student last name");
        this.studentLastName = scanner.nextLine();
        System.out.println("Please enter student grade year (1-4)");
        this.gradeYear= scanner.nextInt();

        setStudentId();

    }

    private void setStudentId(){
        id++;
      this.studentId = gradeYear + "" +id;
    }


    //Ask user how many new users will be added

        // create n number of students

    //promt user

   public void enroll(){
   }

    // enroll in courses

    //Show total balance and pay tuition

    // constructor: prompt user for name and year

    // show status


    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", gradeYear=" + gradeYear +
                ", courses='" + courses + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }
}
