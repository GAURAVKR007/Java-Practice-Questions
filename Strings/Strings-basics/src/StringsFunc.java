public class StringsFunc {
    public static void main(String[] args) {
        String str = "Geeks";

        System.out.println("Length of str is : "+ str.length());
        System.out.println(str.charAt(3));   // to check the character at a specified index
        System.out.println(str.substring(2,4));  // (start from 2 and end from 4-1) In short (start, end-1).

        String s1 = "Geeks";
        String s2 = "Geeks";         // It gets refrenced to s1 because it has same content
        if(s1==s2){
            System.out.println("Yes Equal");
        } else{
            System.out.println("Not Equal");
        }
        String s3 = new String("Geeks");     // This create a new location storage for s3
        if(s1==s3){
            System.out.println("Yes Equal");
        } else{
            System.out.println("Not Equal");
        }

                    // contains Function

//        String one = "GeeksforGeeks";
//        String two = "Geeks";
//
//        System.out.println(one.contains(two));

            // equals Function

        String first = "GeeksforGeeks";
        String second = "GeeksforGeeks";

        if(first.equals(second)){
            System.out.println("yes Equal");
        } else {
            System.out.println("Not Equal");
        }

        String p1 = "GeeksforGeeks";
        String p2 = "H";

        int res = p1.compareTo(p2);        // this check the Strings alphabets wise
        if(res==0){
            System.out.println("Same");
        } else if(res>0) {
            System.out.println("p1 Greater");
        } else if(res<0) {
            System.out.println("p1 Smaller");
        }

        String i1 = "Roronoa Zoro";
        String i2 = "Zoro";
        String i3 = "Roronoa Zoro Demon Zoro king";

        System.out.println(i1.indexOf(i2));
        System.out.println(i3.indexOf(i2,12));     // Search after 12 index

        String c1 = "Geeks";
        String c2 = c1;
        System.out.println(c1);
        System.out.println(c1==c2);
        c1 = c1.concat("forGeeks"); //or -> c1 = c1+"forGeeks"; this make reference of c1 to a new memory location
        System.out.println(c1);
        System.out.println(c1==c2);

        }

    }