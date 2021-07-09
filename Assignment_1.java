//Author Neeraj Patil - 51 Assignment_1
import java.util.*;

public class Assignment_1 {

	public static void main(String args[]) {
		System.out.println("-------|ASSIGNMENT 1|-----------");
		System.out.println("--------------------------------");
		System.out.println("-------|Electricity Bill|-------");
		double r1 = 1.2;
		double r2=2.0;
		double r3=3.0;
		double total=0;
		System.out.println("Electricity Price Breakdown : ");
		System.out.println("Standard Unit Price upto 100 units: " + r1);
		System.out.println("Standard Unit Price between 100 and 200 units: " + r2);
		System.out.println("Standard Unit Price above 300 units: " + r3);
		System.out.print("Enter the units : ");
		Scanner myObj = new Scanner(System.in);
		int units  = myObj.nextInt();
		if (units < 100) {
			total = r1 * units;
		} else if (units <= 300 && units >= 100) {
			double t1 = r1 * 100;
			double t2 = r2 * (units - 100);
			total = t1 + t2;
			
		} else {
			if (units > 300) {
				
				double t1 = r1 * 100;
				double t2 = r2 * 200;
				double t3 = r3 * (units - 300);
				total = t1 + t2 + t3;
				
			}
		}
		System.out.println("----------------------------------");
		System.out.println("Total electricity bill : Rs." + total);
		System.out.println("----------------------------------");
	}

}
