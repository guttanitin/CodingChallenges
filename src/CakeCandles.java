import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class CakeCandles {

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
        int numcandles = 0;
        int maxheight;
        maxheight = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(ar[i] > maxheight){
                maxheight = ar[i];
            }
        }
        for(int i =0; i < ar.length; i++){
            if(ar[i] == maxheight){
                numcandles++;
            }
        }
        return numcandles;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String [] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
