import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int square = i;
        while (square <= num){
            System.out.println(square);
            i++;
            square = i*i;
        }
        // put your code here
    }
}