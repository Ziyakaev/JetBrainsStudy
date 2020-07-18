import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int i = 0;
		int[] array = new int[arraySize];
		while ((i < arraySize) && (scanner.hasNext())) {
			array[i] = scanner.nextInt();
			i++;
		}

		int n = scanner.nextInt();
		int count = 0;
		for (int j = 0; j < arraySize; j++) {
			if (array[j] == n) {
				count++;
			}
		}

		System.out.println(count);
		// put your code here
	}
}