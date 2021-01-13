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
    public static void merge(SortableLinkedList original,SortableLinkedList[]buckets) {
        //Merge all of the linked lists in the bucket array into your original linked list. The original may have elements, and those should be kept.
        for (int i = 0; i < buckets.length; i++) {
            original.extend(buckets[i]);
        }
    }
    public static void radixSortSimple(SortableLinkedList list) {
        //Assume there are no negative values.
        int digits = length(list.get(0));
        int largest = list.get(0);
        for (int i = 0; i < digits; i++) { //how many passes to make
            
                SortableLinkedList a0 = new SortableLinkedList();
                SortableLinkedList b1 = new SortableLinkedList();
                SortableLinkedList c2 = new SortableLinkedList();
                SortableLinkedList d3 = new SortableLinkedList();
                SortableLinkedList e4 = new SortableLinkedList();
                SortableLinkedList f5 = new SortableLinkedList();
                SortableLinkedList g6 = new SortableLinkedList();
                SortableLinkedList h7 = new SortableLinkedList();
                SortableLinkedList i8 = new SortableLinkedList();
                SortableLinkedList j9 = new SortableLinkedList();

                SortableLinkedList[] bucket =  {a0, b1, c2, d3, e4, f5, g6, h7, i8, j9};

            for (int j = 0; j < list.size(); j++) { //looping over the array
                int eachnumber = list.get(j);
                int eachdigit = nth(eachnumber, i);
                //largest number
                if (i == 0) {
                    if (eachnumber > largest) {
                        largest = eachnumber;
                        digits = length(largest);
                    }
                }
                //actual sorting
                bucket[eachdigit].add(eachnumber);
                list.remove(j);
                j--;
            }
            merge(list, bucket);
        }
    } 
    public static void radixSort(SortableLinkedList list) {
        int digits = length(list.get(0));
        for (int i = 0; i < digits; i++) { //how many passes to make
            
                //normal
                SortableLinkedList a0 = new SortableLinkedList();
                SortableLinkedList b1 = new SortableLinkedList();
                SortableLinkedList c2 = new SortableLinkedList();
                SortableLinkedList d3 = new SortableLinkedList();
                SortableLinkedList e4 = new SortableLinkedList();
                SortableLinkedList f5 = new SortableLinkedList();
                SortableLinkedList g6 = new SortableLinkedList();
                SortableLinkedList h7 = new SortableLinkedList();
                SortableLinkedList i8 = new SortableLinkedList();
                SortableLinkedList j9 = new SortableLinkedList();
                //negative only
                SortableLinkedList aa = new SortableLinkedList();
                SortableLinkedList bb = new SortableLinkedList();
                SortableLinkedList cc = new SortableLinkedList();
                SortableLinkedList dd = new SortableLinkedList();
                SortableLinkedList ee = new SortableLinkedList();
                SortableLinkedList ff = new SortableLinkedList();
                SortableLinkedList gg = new SortableLinkedList();
                SortableLinkedList hh = new SortableLinkedList();
                SortableLinkedList ii = new SortableLinkedList();
                SortableLinkedList jj = new SortableLinkedList();

                SortableLinkedList[] bucket =  {a0, b1, c2, d3, e4, f5, g6, h7, i8, j9};
                SortableLinkedList[] negativebucket = {aa, bb, cc, dd, ee, ff, gg, hh, ii, jj};

            for (int j = 0; j < list.size(); j++) { //looping over the array
                int eachnumber = list.get(j);
                int eachdigit = nth(eachnumber, i);

                char negative = (Integer.toString(eachnumber)).charAt(0);
                if (negative != '-') {
                    bucket[eachdigit].add(eachnumber);
                }
                else {
                    negativebucket[10-eachdigit].add(-1*eachnumber);
                }
                list.remove(j);
                j--;
            }
            merge(list, negativebucket);
            merge(list, bucket);
        } 
    }

    
}
