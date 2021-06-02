package simple_programs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int a=2, sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + a;
			a = a + 2;
		}
		System.out.println(sum);
	}

}
