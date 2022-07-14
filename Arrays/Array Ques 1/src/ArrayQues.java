import java.util.Scanner;
import java.util.NoSuchElementException;
import static java.lang.System.exit;

class ArrayQues{
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            int size = sc.nextInt();
            if(size==0){
                exit(0);
            }
            int getArr[] = new int[size];

            for(int i=0;i<size;i++){
                System.out.print("getArr["+i+"] : ");
                getArr[i] = sc.nextInt();
            }
            System.out.println("The Desired Array is below: ");
            int flag = 0;
            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                flag = flag + getArr[i];
                arr[i] = flag;
            }
            for (int i=0; i<size; i++){
                System.out.println("Arr ["+i+"] : "+arr[i]);
            }

        } catch(Exception e) {
            return;
        }
    }
}

