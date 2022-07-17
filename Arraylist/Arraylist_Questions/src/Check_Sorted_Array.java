import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Check_Sorted_Array {
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

        ArrayList<Integer> ascending = new ArrayList<>(list);
        ArrayList<Integer> descending = new ArrayList<>(list);
        boolean res = false;



        Collections.sort(ascending);

        for(int i=0;i<list.size();i++){
            if(!Objects.equals(list.get(i), ascending.get(i))){
                res = false;
                break;
            }
            res = true;
        }

        if(res) {
            System.out.println("ArrayList is Sorted in Ascending order : " + list);
            exit(0);
        }

        Collections.sort(descending);
        descending.sort(Collections.reverseOrder());

            for(int i=0;i<list.size();i++){
                if(!Objects.equals(list.get(i), descending.get(i))){
                    res = false;
                    break;
                }
                res = true;
        }

            if(res){
                System.out.println("ArrayList is Sorted in descending order : " + list);
                exit(0);
            }

        System.out.println("ArrayList is Not Sorted in Any Way : "+list);

    }
}
