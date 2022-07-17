import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        System.out.println(list);
        list.add(0,"Java");
        System.out.println(list);

        System.out.println("=================================");

        System.out.println("List contain Java : "+list.contains("Java"));
        list.remove(0);
        System.out.println("After removing Java : "+list);
        list.add(0,"Java");
        System.out.println("Again Adding Java at 0 index : "+list);
        System.out.println("Java removed : "+list.remove("Java"));
        System.out.println("After Removing Java Again : "+list);

        System.out.println("=================================");

        System.out.println("Index [0] : "+list.get(0));
        list.set(0,"Java");
        System.out.println("After Setting index[0] to Java : "+list);
        System.out.println("Now Index [0] : "+list.get(0));
        System.out.println("Index of \"Geeks\" is :  "+list.indexOf("Geeks"));
        System.out.println("Index of \"Dope\" is : "+list.indexOf("Dope"));

        System.out.println("=================================");

        System.out.println("Arraylist is : "+list);
        System.out.println("Is Arraylist Empty : "+list.isEmpty());
        list.clear();
        System.out.println("Cleared the Arraylist : "+list);
        System.out.println("Is Arraylist Empty : "+list.isEmpty());

    }
}
