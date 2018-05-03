import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class MinMax {

    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        long tempnummin = 0;
        long tempnummax = 0;
        long tempsum = 0;
        long minsum;
        long maxsum;
        for(int i =0; i < arr.length; i++){
            tempsum += arr[i];
        }
        long tempnums = arr[0];
        long tempnums2 = arr[0];
        minsum = tempnums;
        maxsum = tempnums2;
        for(int i = 1; i < arr.length-1; i++){
            tempnummin = Math.min(arr[i],arr[i+1]);
            if(tempnummin < tempnums){
                tempnums = tempnummin;
                minsum = tempnums;
            }
            tempnummax = Math.max(arr[i],arr[i+1]);
            if(tempnummax > tempnums2){
                tempnums2 = tempnummax;
                maxsum = tempnummax;
            }
        }
        long summin = tempsum-maxsum;
        long summax = tempsum-minsum;
        System.out.println(summin + " " + summax);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String [] args){

        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);

    }
}
