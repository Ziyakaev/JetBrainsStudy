import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < a) {
            System.out.println("Deficiency");
        } else if (c > b) {
            System.out.println("Excess ");
        } else {
            System.out.println("Normal");
        }
        // put your code here
    }
}