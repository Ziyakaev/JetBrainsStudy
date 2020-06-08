import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();


        if (x2 == x1 || y2 == y1) {
            System.out.println("YES");
        }
        else {
            double tan = Math.abs(y2 - y1) / (double) Math.abs(x2 - x1);

            if (tan == 1d || tan == 1 / 2 || tan == 3 / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        // put your code here
    }
}