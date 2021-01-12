public class Radix {
    public static int nth(int n, int col) {
        String num = Integer.toString(n);
        int result = 0;
        if (num.length()-col <= num.length() && num.length()-col-1 >= 0 && num.charAt(num.length()-1-col) != '-') {
            result =  Character.getNumericValue(num.charAt(num.length() - 1 - col));
        }
        return result;
    }  

    public static int length(int n) {
        return 4;
    }
    public static void merge(MyLinkedList original,MyLinkedList[]buckets) {

    }
    public static void main(String[] args) {
        System.out.println(nth(-123,3));
    }
}
