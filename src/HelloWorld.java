/*
By: Nitin Gutta
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HelloWorld {


    static void staircase(int n) {
        /*
         * Write your code here.
         */
        int numspaces = n;
        for(int j = 1; j <= n; j++){
            for(int i = numspaces; i > 1; i--){
                System.out.print(" ");
            }
            for(int k = j; k > 0; k--){
                System.out.print("#");
            }
            //if(numspaces <= 5) {
                System.out.println();
            //}
            numspaces--;
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
