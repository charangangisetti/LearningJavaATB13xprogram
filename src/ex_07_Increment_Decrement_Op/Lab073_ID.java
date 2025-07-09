package ex_07_Increment_Decrement_Op;

import java.rmi.server.ExportException;

public class Lab073_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++; // post - Increment
        System.out.println(a);
        System.out.println(result);

        // Line No  | a  | Exp
        //    7     | 10 | NA
        //    8     | 11 | 10
        //    9     | 11 | NA
        //    10    | NA | 10


    }
}
