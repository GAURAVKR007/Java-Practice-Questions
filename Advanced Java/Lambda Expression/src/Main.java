import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,17,30));
        printCondition(al,x->x%2==0);      // Lambda Expression
    }

    public static void printCondition(List<Integer> C, Predicate<Integer> P){
        for(Integer x : C)
            if(P.test(x))
                System.out.print(x+" ");
    }
}
