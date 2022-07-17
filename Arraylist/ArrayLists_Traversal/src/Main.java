import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
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
        System.out.println("=================================");
        System.out.println("Arraylist is : "+list);

        System.out.println("=================================");

        System.out.println("ArrayList Traversal");
        System.out.println("---------------------------------");

        // Traversal Method 1

        for(int i=0;i< list.size();i++){
            System.out.println("Index ["+i+"] : "+list.get(i));
        }

        System.out.println("=================================");

        // Traversal Method 2

        System.out.print("Items in arraylist are : ");
        for(Integer x: list){
            System.out.print(x+ " ");
        }

        System.out.println("\n=================================");

        // Traversal Method 3

        System.out.print("Items in arraylist are : ");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println("\n=================================");

        // Traversal Method 4

        System.out.print("Items in arraylist are : ");
        list.forEach(x-> System.out.print(x+" "));

        System.out.println("\n=================================");
    }
}
