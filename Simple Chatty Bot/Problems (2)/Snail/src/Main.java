import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int feetsUp = scanner.nextInt();
        int feetsDown = scanner.nextInt();
        boolean isUp = true;
        int countOfDay = 0;
        while (isUp){
            height = height -feetsUp;
            if (height < 0){
                isUp  = false;
            } else {
            height += feetsDown;
            countOfDay++;
        }}

        System.out.println(countOfDay);
        // put your code here
    }
}