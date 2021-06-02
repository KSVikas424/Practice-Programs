package capgemini;

public class Main {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,48};
		int feet =0;
		for(int i=0;i<arr.length;i++){
			int fu=arr[i]/12;
			feet = feet+fu;
			}
System.out.println(feet);
	}

}
