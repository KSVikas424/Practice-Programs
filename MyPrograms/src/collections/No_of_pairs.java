package collections;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    	
    	LinkedList<Integer> arr = (LinkedList<Integer>) ar;
    	int count = 0;
        for(int i=0;i<n;i++){
            int temp1 = arr.get(i);
            for(int j=i+1;j<n;j++){
                int temp2 = arr.get(j);
                if(temp1 == temp2) {
                	count++;
                	n--;
                	arr.remove(j);
                	break;
                }
            }
        }
        return count;
    }

}

public class No_of_pairs {
	
    public static void main(String[] args){
        
    	System.out.print("Enter size of array: ");
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();

        List<Integer> ar = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int arItem = scan.nextInt();
            ar.add(arItem);
        }
        System.out.println(ar);

        int result = Result.sockMerchant(n, ar);
        System.out.println(result);
    }
}
