import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		boolean isExit = true;
		while (isExit){
			num = scanner.nextInt();
			if (num == 0){ isExit = false;
			} else {
				sum += num;
			}}
		System.out.println(sum);
        // put your code here
    }
}