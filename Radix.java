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
        String num = Integer.toString(n);
        int result = num.length();
        if (num.charAt(0) == '-') {
            result--;
        }
        return result;
    }
    public static void merge(MyLinkedList original,MyLinkedList[]buckets) {
        //Merge all of the linked lists in the bucket array into your original linked list. The original may have elements, and those should be kept.
        for (int i = 0; i < buckets.length; i++) {
            original.extend(buckets[i]);
        }
    }
    public static void radixSort(SortableLinkedList list) {
        //int digits = list.get(0);
        //for (int i = 0; i < list.size(); i ++) {
        // }
    }

    
}
