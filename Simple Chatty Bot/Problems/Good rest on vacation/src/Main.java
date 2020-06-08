import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfDay = scanner.nextInt();
        int costOfFood = scanner.nextInt();
        int costOfFly = scanner.nextInt();
        int costOfNight = scanner.nextInt();
        System.out.println(countOfDay*(costOfFood+costOfNight)+-costOfNight+2*costOfFly);
        // put your code here
    }
}