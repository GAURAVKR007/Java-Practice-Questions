import java.util.Scanner;

public class Binary_and_Decimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal to Binary Conversion

        System.out.print("Enter the number [Decimal] : ");
        int num = sc.nextInt();
        StringBuilder str = new StringBuilder(" ");
        while(num>0){
            str.insert(0, (num % 2));
            num = num/2;
        }

        System.out.println("Binary : "+str);

//         Binary to Decimal Conversion

//        System.out.print("Enter the [Binary] number : ");
//        int bin_num = sc.nextInt();
//        int count = 0;
//        int res = 0;
//
//        while(bin_num>0){
//           res = (int) (res+ (bin_num%10)*Math.pow(2,count));
//            count++;
//            bin_num = bin_num/10;
//        }
//
//        System.out.println("Decimal no is : "+res);

        // Alternate Method to do Binary to Decimal

        System.out.print("Enter the [Binary] number : ");
        String s = sc.nextLine();

        int m=0;
        int k=1;

        for(int i=s.length()-1;i>=0;i--){
            m = m + (s.charAt(i)-'0')*k;
            k = k*2;
        }
        System.out.println("Decimal no is : "+m);



    }
}
