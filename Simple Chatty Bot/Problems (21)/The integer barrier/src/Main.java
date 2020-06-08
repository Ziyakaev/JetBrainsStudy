import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = scanner.nextInt();
		while (sum < 1000 && num != 0) {
			sum += num;
			num = scanner.nextInt();
		}
		if (sum >= 1000) {
			System.out.println(sum - 1000);
		} else {
			System.out.println(sum);
		}

		// put your code here
	}
}