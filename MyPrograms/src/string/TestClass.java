package string;

public class TestClass {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int testcases = scan.nextInt();
		for(int test = 1; test<=testcases ; test++) {
			int lowerletters=scan.nextInt();
			String s= scan.next();
			if(lowerletters % 2 ==0)
				System.out.println("B");
			else 
				System.out.println("A");
		}
	}

}
