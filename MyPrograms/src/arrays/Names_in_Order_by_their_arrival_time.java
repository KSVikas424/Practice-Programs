package arrays;

public class Names_in_Order_by_their_arrival_time {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter No. of people:");
		int numPeo = scan.nextInt();
		String[] peopleArray = new String[numPeo];
		int []arrivalTimes = new int[numPeo];
		
		for(int i=0;i<numPeo;i++) {
			peopleArray[i] = scan.next();
		}
		for(int i=0;i<numPeo;i++) {
			arrivalTimes[i] = scan.nextInt();
		}
		
		for(int j=0;j<numPeo;j++) {
			for(int i=0;i<numPeo-1;i++) {
			if(arrivalTimes[i] >arrivalTimes[i+1]) {
				int temp = arrivalTimes[i];
				arrivalTimes[i] = arrivalTimes[i+1];
				arrivalTimes[i+1] = temp;
				String stringTemp = peopleArray[i];
				peopleArray[i] = peopleArray[i+1];
				peopleArray[i+1] = stringTemp;
			}
			}
		}
		
		for(String names : peopleArray) {
			System.out.print(names+" ");
		}
		scan.close();	
	}

}
