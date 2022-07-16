import java.util.Scanner;

public class PrintAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first character : ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter the second character : ");
        char c2 = sc.next().charAt(0);

       for(int i = (int)c1; i<=(int) c2; i++ ){
           System.out.print((char) i+" ");
       }





    }
}
