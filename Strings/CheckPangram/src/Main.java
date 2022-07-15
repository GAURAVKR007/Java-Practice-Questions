import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        boolean isPangram = Pangram(str);

        if(isPangram==true){
            System.out.println("String is Pangram");
        }else{
            System.out.println("String is not Pangram");
        }

    }

    public static boolean Pangram(String s){

        int n = s.length();

        if(n<26){
            return false;
        }
        String str = s.toUpperCase();
        System.out.println(str);

        boolean []arr = new boolean[n];
        for(int i=0; i<n;i++){
            char x = str.charAt(i);
            if(x>='A' && x<='Z'){
                arr[x - 'A'] =true;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}