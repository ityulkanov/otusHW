package com.ityulkanov;

public class BaseClass {

    public String countFromStartToTen(int start) {
        for (int i = start; i < 10; i++) {
            return "I'm counting from " + start + "to 10" + "counter now is" + i;
        }
        return "Done!";
    }

    public int calculateFactorial(int n){
        if (n < 2) {
            return n;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

}
