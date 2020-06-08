import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0){
            if (num % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            num = scanner.nextInt();
        }

        // put your code here
    }
}