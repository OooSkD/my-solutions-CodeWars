package kyu5;

import java.util.ArrayList;
import java.util.List;

/*
DESCRIPTION:
    For this exercise you will be strengthening your page-fu mastery.
    You will complete the PaginationHelper class, which is a utility class helpful for querying paging
    information related to an array.

    The class is designed to take in an array of values and an integer indicating how many items will be
    allowed per each page. The types of values contained within the collection/array are not relevant.

    The following are some examples of how this class is used:
 */

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = new ArrayList<>(collection);
        this.itemsPerPage=itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double)collection.size()/itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int pageCounter = pageCount()-1;
        if (pageIndex>pageCounter || pageIndex<0)
            return -1;
        else if (pageIndex!=pageCounter)
            return itemsPerPage;
        else return itemCount()%itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex>(itemCount()-1) || itemIndex<0 || pageCount()==0 )
            return -1;
        else
            return itemIndex/itemsPerPage;
    }
}
