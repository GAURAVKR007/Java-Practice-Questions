import java.lang.String;

public class Main {
    public static void main(String[] args) {

        // Strings operations

        String str = "GEEKS";
        String str1 = "geeks";

        System.out.println(str.equalsIgnoreCase(str1));

        System.out.println("===================================");

        // toUpperCase()

        String s1 = "Hello";
        String s2 = "HellO";

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());

        System.out.println("===================================");

        // capitalize()

        String q1 = "hello";
        String q2 = "geeks";

        String output = q1.substring(0, 1).toUpperCase() + q1.substring(1);
        System.out.println(output);
        String output2 = q2.substring(0,1).toUpperCase() + q2.substring(1);
        System.out.println(output2);

        System.out.println("===================================");

        // StringBuilder class strings are Mutable
        // they can be modified .
        // below program can show this

        StringBuilder sb1 = new StringBuilder("geeks");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append("forgeeks");     // Modifying the Existing String
        System.out.println(sb1);
        if(sb1==sb2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        System.out.println("===================================");

       /* StringBuilder and StringBuffer Method

         methods same as String :
         -------------------------------

         length(), charAt(index), indexOf(str), indexOf(str,fromIndex)
         lastIndexOf(str), last IndexOf(str, fromIndex), compareTo(sb),
         substring(beginIndex), substring(beginIndex, endIndex-1), chars(), etc.

         New Methods :
         ----------------

         append(x), inset(offset, x), setCharAt(index, c), reverse(),
         deleteCharAt(index), delete(start, end),
         capacity(), replace(start, end, str), etc.     */

        // Some Operation on StringBuilder

        StringBuilder sb = new StringBuilder("skeeg");                        // Same output if we replace
                                                                              // StringBuilder with StringBuffer
        sb.append("rofskeeg");
        System.out.println("After Appending skeeg : "+sb);

        sb.reverse();
        System.out.println("reverse of skeegrofskeeg  : "+sb);

        sb.setCharAt(0,'G');
        sb.setCharAt(8,'G');
        System.out.println("After inserting an 'G' at index 0 and 8 : "+sb);

        sb.delete(0,5);
        System.out.println("Deleting in String from index 0 to 4 : "+ sb);

        sb.insert(0,"Geeks");
        System.out.println("Inserting \"Geeks\" at Index 0 : "+sb);

        System.out.println("===================================");

    }
}
