package simple_programs;

class Sum{
	 public static void main(String args[]) {
	     java.util.Scanner scan = new java.util.Scanner(System.in);
	     int n = scan.nextInt();
	     addTwoDigits(n);
	 }
	 static void addTwoDigits(int num){
	  int sum=0;
	     while(num>0){
	         int temp = num%10;
	         sum = sum + temp;
	         num = num/10;
	     }
	     System.out.println(sum);
	 }
	}