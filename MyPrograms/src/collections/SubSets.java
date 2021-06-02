package collections;

public class SubSets {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int size = scan.nextInt();
		int weigh = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		int count = 0;
		for (int i = 0; i < size - 3; i++) {
			for (int j = i; j < size - 3; j++) {
				for (int k = j; k < size - 3; k++) {
					if ((arr[i] + arr[j] + arr[k]) <= weigh) {
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}

}
