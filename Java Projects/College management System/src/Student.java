import java.util.Date;
import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String dob;
    private String stream;
    private String batch;
    private long phoneNo;

    Scanner scan = new Scanner(System.in);

    public void UserInput(){
        System.out.print("Enter your name : ");
        this.studentName=scan.nextLine();
        System.out.print("Enter your Date of birth : ");
        this.dob=scan.nextLine();
        System.out.print("Enter your Phone no : ");
        this.phoneNo=scan.nextLong();
        scan.nextLine();
        System.out.println("Enter the Stream you want to take : ");
        this.stream=scan.nextLine();

    }

    public void UserShow(){

    }


    public Student() {
        this(0,"ABC","01-01-2000","Science","2022-2024",123456789);
    }

    public Student(int studentId, String studentName, String dob, String stream, String batch, long phoneNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dob = dob;
        this.stream = stream;
        this.batch = batch;
        this.phoneNo = phoneNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDob() {
        return dob;
    }

    public String getStream() {
        return stream;
    }

    public String getBatch() {
        return batch;
    }

    public long getPhoneNo() {
        return phoneNo;
    }


}
