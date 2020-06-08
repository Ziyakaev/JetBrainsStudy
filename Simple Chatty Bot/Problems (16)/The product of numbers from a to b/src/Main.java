import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        long multiply = 1;
        for (int i = start; i < end; i++){
            multiply *=i;
        }

        System.out.println(multiply);
        // put your code here
    }
}