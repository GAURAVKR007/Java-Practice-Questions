import java.util.ArrayList;
import java.util.Scanner;

public class Average_of_ArrayList {
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

        int count = 0;
        int sum = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=0){
                sum = sum+ list.get(i);
                count++;
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Average of Positive numbers is ArrayList is : "+ (double) (sum/count));
        System.out.println("---------------------------------");
    }
}
