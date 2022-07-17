import java.util.ArrayList;
import java.util.Scanner;

public class Separate_Even_Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the Size of ArrayList : ");
        int size = sc.nextInt();

        list.ensureCapacity(size);

        System.out.println("Enter the Elements of Arraylist");
        System.out.println("---------------------------------");
        for(int i=0;i<size;i++){
            System.out.print("Index ["+i+"] : ");
            int x = sc.nextInt();
            list.add(x);
        }

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                even.add(list.get(i));
            }else{
                odd.add(list.get(i));
            }
        }
        System.out.println("---------------------------");
        System.out.println("Original List is :  "+ list);
        System.out.println("---------------------------");
        System.out.println("Even numbers are : "+even);
        System.out.println("---------------------------");
        System.out.println("Odd numbers are : "+odd);
        System.out.println("---------------------------");
    }
}
