package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Car {
	public static void main(String[] args) {
		ArrayList<Cars> c = new ArrayList<Cars>();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("How many CAR details you want to enter");
		int noofcars = scan.nextInt();
		for (int i = 1; i <= noofcars; i++) {
			System.out.println("Enter Car "+i+" details-->");
			System.out.print("Car Name: ");
			String name = scan.next();
			System.out.print("Car colour: ");
			String colour = scan.next();
			System.out.print("Car Number: ");
			int number = scan.nextInt();
			System.out.print("Car No.of Seats: ");
			int noofseats = scan.nextInt();
			
			c.add(new Cars(name,colour,number,noofseats));
		}
		System.out.println(c);
		scan.close();
	}
}

class Cars {
	String name, colour;
	int carno, seatingcapacity;

	public Cars(String name, String colour, int carno, int seatingcapacity) {
		super();
		this.name = name;
		this.colour = colour;
		this.carno = carno;
		this.seatingcapacity = seatingcapacity;
	}

	public String toString() {
		return name + ", " + colour + ", " + carno + ", " + seatingcapacity + " \n";
	}
}