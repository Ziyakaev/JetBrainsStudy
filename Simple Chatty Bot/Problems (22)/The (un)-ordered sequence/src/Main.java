import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int up = 0, down = 0;
        int i = 0;
        while (num != 0 &&()){
            int next = scanner.nextInt();
            if (next == 0) {
                break;
            }
            if (num > next){
                up++;
            } else {
                down++;
            }
            num = next;
            i++;
        }

        if (i == up || i == down){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // put your code here
    }
}