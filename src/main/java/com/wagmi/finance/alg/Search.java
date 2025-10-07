package main.java.com.wagmi.finance.alg;

/*
 TODO[Student]: Binary search by Transaction ID
 - Array must be sorted by `Transaction.getId()` ascending.
 - Handle null array (throw NPE) and null id (return -1) per tests.
 - See `SearchTest` for target indices and edge cases.
*/

import main.java.com.wagmi.finance.model.Transaction;

public final class Search {
    private Search() {

    }

    public static int binarySearchById(Transaction[] sortedById, String id) {
        // stub for binary search
        if(id == null) return -1;


        if (sortedById == null) throw new NullPointerException("Not implemented");


        int low= 0;
        int high= sortedById.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String ID = sortedById[mid].getId();
            int com = ID.compareTo(id);
            if (com == 0)
                return mid;
            else if (com < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1 ;
    }
}
