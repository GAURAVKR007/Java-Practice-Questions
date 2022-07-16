import java.util.Scanner;

import static java.lang.System.exit;

public class CheckAnagram {
    public static void main(String[] args) {
        // Check For Anagram
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the First String  : ");
        String str10 = sc.nextLine();
        System.out.print("Enter the Second String  : ");
        String str20 = sc.nextLine();

        str10 = str10.toLowerCase();
        str20 = str20.toLowerCase();

        int n1 = str10.length();

        if(str10.length()!=str20.length()){
            System.out.println("strings are not Anagram");
            exit(0);
        }

        int count1[] = new int[256];
        for(int i=0;i<n1;i++){
            count1[str10.charAt(i)]--;
            count1[str20.charAt(i)]++;
        }
        boolean isAnagram = true;
        for(int i=0;i<256;i++){
            if(count1[i]!=0) {
                isAnagram = false;
            }
        }
        if (!isAnagram){
            System.out.println("Strings are Not Anagram");
        } else {
            System.out.println("Strings are Anagram");
        }
    }
}
