   //  Check if the array is sorted or not
import java.util.Scanner;
public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];
        for(int i=0;i<arrLen;i++){
            System.out.print("Array ["+i+"] : ");
            arr[i]= sc.nextInt();
        }

        boolean isSorted = Sorted(arr,arrLen);
        if(isSorted){
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }

    public static boolean Sorted(int array[], int length){
        for(int i=0;i<length-1;i++){
            if(array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
}
