import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Get_Smaller_Element {
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

        System.out.println("---------------------------------------");
        System.out.print("Enter the Biggest number :  ");
        int x = sc.nextInt();


        ArrayList<Integer> small = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(list.get(i)<x){
                small.add(list.get(i));
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println("The Desired Arraylist is : "+small);
        System.out.println("---------------------------------------------------");
    }
}
