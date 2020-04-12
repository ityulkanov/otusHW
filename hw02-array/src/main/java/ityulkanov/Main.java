package ityulkanov;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DIYArrayList src = new DIYArrayList();
        DIYArrayList dest = new DIYArrayList();
        Collections.addAll(src, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23");
        Collections.copy(src, dest);
        Collections.sort(src);


    }
}
