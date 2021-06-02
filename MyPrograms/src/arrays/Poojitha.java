package arrays;
import java.util.Scanner;
public class Poojitha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numBlocks=scan.nextInt();
		int arr[] = new int[numBlocks];
		for(int i=0;i<numBlocks;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(numBlocks/2);

	}

}
