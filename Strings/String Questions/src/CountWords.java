import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        char ch = ' ';

        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        count++;

        System.out.println("No. of words is this string are : "+count);

    }
}
