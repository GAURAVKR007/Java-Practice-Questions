import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Count_Distinct_Element {
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

        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(list);
        result.add(list.get(0));
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) != list.get(i-1)) {
                result.add(list.get(i));
            }
            else {
                continue;
            }
        }

        System.out.println("-----------------------------------------");
        System.out.print("No. of Distinct Elements are : "+result.size());
        System.out.println("-----------------------------------------");
    }
}
