import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,30,50};
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("Maximum in array is : "+max);

        // Iterate 10 times contains "5"

        Stream.iterate(1,x->x+1)
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);
    }
}
