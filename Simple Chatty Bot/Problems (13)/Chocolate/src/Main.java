import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		int k = scanner.nextInt();

		if ((((k / width) <= height) && (k % width == 0)) || (
				 ((k / height) <= width) && (k % height == 0))
				) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}// put your code here
	}
}