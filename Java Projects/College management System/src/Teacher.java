import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Teacher {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private static int teacherId;
    private String teacherName;
    private String post;
    private byte experience;
    private Date dob;
    private long phoneNo;
    Date date1=null;

//    public Teacher(int teacherId,String teacherName, String post, byte experience, Date dob, long phoneNo){
//        this.teacherId = teacherId;
//        this.teacherName = teacherName;
//        this.post = post;
//        this.experience = experience;
//        this.dob = dob;
//        this.phoneNo = phoneNo;
//    }

    public void userInput() {
//        try {


        System.out.print("Enter the name : ");
        String name = sc.nextLine();
//            System.out.print("Enter your Date of birth : ");
//            String cinput = sc.nextLine();
//            if (null != cinput && cinput.trim().length() > 0) {
//                date1 = format.parse(cinput);
//            }
        System.out.print("Enter the post :  ");
        String post = sc.nextLine();
        System.out.print("Enter how much experience you have : ");
        byte exp = sc.nextByte();
        System.out.print("Enter you phone number : ");
        long phoneNo = sc.nextLong();

        setInfo(name, post, exp, date1, phoneNo);
        getInfo();
//        }catch (Exception e){
//            System.out.println("Error");
//        }
    }

    public void setInfo(String teacherName, String post, byte experience, Date dob, long phoneNo){
        this.teacherId = teacherId +1;
        this.teacherName = teacherName;
        this.post = post;
        this.experience = experience;
        this.dob = dob;
        this.phoneNo = phoneNo;
    }

    public void getInfo(){
        if(teacherId == 0){
            System.out.println("Error");
        }else{
            System.out.println("Teacher name is : "+teacherName);
            System.out.println("Teacher post is : "+post);
            System.out.println("Teacher experience is : "+experience);
//            System.out.println(date1);
            System.out.println("Test phone number : "+phoneNo);
        }
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getPost() {
        return post;
    }

    public byte getExperience() {
        return experience;
    }

    public Date getDob() {
        return dob;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
}