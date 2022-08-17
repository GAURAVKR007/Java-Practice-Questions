import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Numeber "+num+" is prime : "+isPrime(num));
        System.out.println("Next prime number after "+num+" is : "+nextPrime(num));
    }

    public static boolean isPrime(int num){
        BigInteger prime = BigInteger.valueOf(num);
        return prime.isProbablePrime(1);
    }

    public static BigInteger nextPrime(int num){
        BigInteger nextPrime = BigInteger.valueOf(num);
        return nextPrime.nextProbablePrime();
    }
}
