import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Fibonacci series sum till "+num+" is : "+Fibonacci(num));
    }

    public static BigInteger Fibonacci(int num){
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        BigInteger sum = new BigInteger("1");
        if(num==1){
            return first;
        }

        for(int i=2; i<=num ; i++){
            sum = first.add(second);
            first = second;
            second = sum;
        }
        return sum;
    }
}
