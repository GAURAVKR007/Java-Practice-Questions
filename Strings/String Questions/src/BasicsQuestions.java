import java.util.Scanner;

// Pattern Searching in Strings
public class BasicsQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pattern Searching
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the pattern you want to search : ");
        String pat = sc.nextLine();
        int res = str.indexOf(pat);
        System.out.print("Index of occurrences of pattern : ");
        while(res>=0){
            System.out.print(res+" ");
            res = str.indexOf(pat,res+1);
        }

        System.out.println("\n==================================");

        // Alternate method

        System.out.println("By Alternate Method");
        System.out.println("--------------------");

        System.out.print("Index of occurrences of pattern : ");
        for(int i=0;i<str.length()-pat.length()+1;i++){
            if(str.substring(i,i+pat.length()).equals(pat)){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n==================================");

        // Digits after Decimal points

        System.out.print("Enter the String of Digits in Decimal : ");
        String digits = sc.nextLine();

        res = digits.indexOf('.');
        if(res>0){
            System.out.println("Digits after decimal are : "+digits.substring(res+1));
        } else {
            System.out.println("No digits found");
        }

        System.out.println("\n==================================");

//         Find one Extra Character

        System.out.print("Enter the First String [one character less] : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the Second String [one character more] : ");
        String str2 = sc.nextLine();                             // this string is same as the str1 but has one extra char

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int count[] = new int[26];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']--;
            count[str2.charAt(i)-'a']++;
        }
        count[str2.charAt(str1.length())-'a']++;
        for(int i=0;i<26;i++){
            if(count[i]==1){
                char result = (char) (i+'a');
                System.out.println("The Extra character is : "+result);
            }
        }








    }

}
