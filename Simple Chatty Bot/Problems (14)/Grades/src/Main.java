import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int[] grades = new int[4];
		for (int i = 0; i < n; i++) {
			count = scanner.nextInt();
			if (count == 3) {
				grades[1]++;
			} else if (count == 4) {
				grades[2]++;
			} else if (count == 5) {
				grades[3]++;

			} else {
				grades[0]++;
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(grades[i] + " ");
		}
		// put your code here
	}
}