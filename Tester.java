public class Tester {
    public static void main(String args[]) {
        //testing nth
        System.out.println( "nth(-123, 0) 3 | " + Radix.nth(-123, 0));
        System.out.println( "nth(-123, 1) 2 | " + Radix.nth(-123, 1));
        System.out.println( "nth(-123, 2) 1 | " + Radix.nth(-123, 2));
        System.out.println( "nth(-123, 3) 0 | " + Radix.nth(-123, 3));
        System.out.println( "nth(-123, 4) 0 | " + Radix.nth(-123, 4));
        System.out.println( "nth(0, 0) 0 | " + Radix.nth(0, 0));
        //testing length
        System.out.println();
        System.out.println("length(1) 1 | " + Radix.length(1));
        System.out.println("length(12) 2 | " + Radix.length(12));
        System.out.println("length(123) 3 | " + Radix.length(123));
        System.out.println("length(-123) 3 | " + Radix.length(-123));
        //testing merge
        System.out.println();

        MyLinkedList A = new MyLinkedList();
            A.add("a");
            A.add("a");
        MyLinkedList B = new MyLinkedList();
            B.add("b");
            B.add("b");
            B.add("b"); 
        MyLinkedList C = new MyLinkedList();

        MyLinkedList D = new MyLinkedList();
            D.add("d");
            D.add("d");
        MyLinkedList[] groups = {B,D};
        Radix.merge(A, groups);
        System.out.println(A.toString());
    }
}
