
//Author Neeraj Patil - 51 Assignment_3
import java.util.*;

class Assignment_3 {
	public static void main(String args[]) {
		System.out.println("-------|ASSIGNMENT 3|-----------");
		int totalRuns = 0;
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int sixes = 0;
		float strikeRate = 0;
		float avg = 0;
		int[] runs = new int[500];
		int t = 0;
		int tc = 0;
		int mb = 0;
		for (int j = 0; j < 5; j++) {
			System.out.println("Enter the balls played in " + (j + 1) + " inning");
			Scanner myObj = new Scanner(System.in);
			mb = myObj.nextInt();
			t = t + mb;
			for (int i = 0; i < mb; i++) {
				tc++;
				runs[tc] = (int) (Math.random() * 7) + 0;
			}
			tc++;
			runs[tc] = 9;
		}

		for (int i = 0; i < tc - 1; i++) {
			if (runs[i] != 9) {
				totalRuns = totalRuns + runs[i];
				if (runs[i] == 0) {
					zeroes++;
				} else if (runs[i] == 1) {
					ones++;
				} else if (runs[i] == 2) {
					twos++;
				} else if (runs[i] == 3) {
					threes++;
				} else if (runs[i] == 4) {
					fours++;
				} else {
					if (runs[i] == 6) {
						sixes++;
					}
				}
			}
		}

		float temp = totalRuns;
		avg = temp / 5;
		strikeRate = (temp / t) * 100;
		System.out.println("-------|Runs Scored|-----------");
		System.out.println("Runs scored : ");
		for (int i = 0; i < tc - 1; i++) {
			if (runs[i] != 9) {
				System.out.print(runs[i] + "  ");
			}
		}
		System.out.println("");
		System.out.println("1. Average score of last 5 matches: " + avg);
		System.out.println("2. Total runs : " + totalRuns);
		System.out.println("3. Number of Os, 1s, 2s, 3s, 4s and 6s.");
		System.out.println("	0's        		: " + zeroes);
		System.out.println("	1's        		: " + ones);
		System.out.println("	2's        		: " + twos);
		System.out.println("	3's        		: " + threes);
		System.out.println("	4's        		: " + fours);
		System.out.println("	6's        		: " + sixes);
		System.out.println("4. Average Strike Rate (runs per ball): " + strikeRate);
		System.out.println("");
	}
}