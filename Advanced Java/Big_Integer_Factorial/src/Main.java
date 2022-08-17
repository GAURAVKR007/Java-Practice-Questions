import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Factorial of "+num+" is : "+Factorial(num));

    }

    public static BigInteger Factorial(int a){
        BigInteger fac = new BigInteger("1");        // Initialization of BigInteger
        for(int i=2 ; i<=a; i++){
            BigInteger x = BigInteger.valueOf(i);        // Convert int into BigInteger
            fac = fac.multiply(x);
        }
        return fac;
    }
}
