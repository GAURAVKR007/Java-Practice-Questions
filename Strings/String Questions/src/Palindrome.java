import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        str = str.toUpperCase();
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        boolean isPalindrome = true;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(str+" is Palindrome");
        } else {
            System.out.println(str+" is not Palindrome");
        }






    }
}
