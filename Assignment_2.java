//Author Neeraj Patil - 51 Assignment_2

public class Assignment_2 {
	public static void main(String args[]) {
		System.out.println("-------|ASSIGNMENT 2|-----------");
		int totalRuns = 0;
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int sixes = 0;
		float strikeRate = 0;
		int[] runsScored = new int[30];

		for (int i = 0; i < runsScored.length; i++) {
			runsScored[i] = (int) (Math.random() * (6 - 0 + 1)) + 0;// Generating random numbers
		}

		for (int i = 0; i < runsScored.length; i++) {
			totalRuns = totalRuns + runsScored[i];
			if (runsScored[i] == 0) {
				zeroes++;
			} else if (runsScored[i] == 1) {
				ones++;
			} else if (runsScored[i] == 2) {
				twos++;
			} else if (runsScored[i] == 3) {
				threes++;
			} else if (runsScored[i] == 4) {
				fours++;
			} else {
				if (runsScored[i] == 6) {
					sixes++;
				}
			}
		}

		float temp = totalRuns;
		strikeRate = (temp / 30) * 100;
		System.out.println("-------|Runs Scored|-----------");
		System.out.println("Runs scored over 5 overs : ");
		for (int i = 0; i < runsScored.length; i++) {
			System.out.print(runsScored[i] + "  ");
		}
		System.out.println("");
		System.out.println("1. Total runs : " + totalRuns);
		System.out.println("2. Number of Os, 1s, 2s, 3s, 4s and 6s.");
		System.out.println("	0's        		: " + zeroes);
		System.out.println("	1's        		: " + ones);
		System.out.println("	2's        		: " + twos);
		System.out.println("	3's        		: " + threes);
		System.out.println("	4's        		: " + fours);
		System.out.println("	6's        		: " + sixes);
		System.out.println("3. Average Strike Rate (runs per ball): " + strikeRate);
		System.out.println("");
	}
}
