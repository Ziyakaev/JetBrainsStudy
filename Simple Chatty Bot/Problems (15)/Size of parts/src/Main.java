import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int size;
		int[] readyToBe = new int[3];
		for (int i = 0; i < num; i++) {
			size = scanner.nextInt();
			if (size == 0) {
				readyToBe[0]++;
			} else if (size == 1) {
				readyToBe[1]++;
			} else {
				readyToBe[2]++;
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(readyToBe[i] + " ");
		}
		// put your code here
	}
}