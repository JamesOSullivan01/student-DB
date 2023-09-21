import java.util.Scanner;

public class Student {

    private String studentFirstName;
    private String studentLastName;
    private String studentId;
    private int gradeYear;
    private String courses = "";

    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    Scanner scanner = new Scanner(System.in);

    public Student(){
        System.out.println("Please enter student first name");
        this.studentFirstName = scanner.nextLine();
        System.out.println("Please enter student last name");
        this.studentLastName = scanner.nextLine();
        System.out.println("Please enter student grade year (1-4)");
        this.gradeYear= scanner.nextInt();

        scanner.nextLine();
        setStudentId();

    }

    private void setStudentId(){
        id++;
      this.studentId = gradeYear + "" +id;
    }



   public void enroll() {
       do {
           System.out.println("Enter course to enroll (Q to quit)");
           System.out.println("1 - History 101\n2 - Mathematics 101\n3 - English 101\n4 - Chemistry 101\n5 - Computer Science 101");
           String course = scanner.nextLine();
           if (!course.equals("Q")) {
               courses += "\n" + course;
               tuitionBalance = tuitionBalance + costOfCourse;
               System.out.println("Enrolled in: " + courses);
               System.out.println("Tuition Balance: " + tuitionBalance);
           } else {
               break;
           }
       }while (1 != 0);
   }

    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Your tuition balance after this payment is: $" + tuitionBalance);
    }

    public String showInfo(){
        return "Name: " + studentFirstName + " " + studentLastName + "\nGrade Level: " + gradeYear + "\n Student ID: " + studentId + "Enrolled in: " + courses + "\nBalance: " + tuitionBalance;
    }


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
