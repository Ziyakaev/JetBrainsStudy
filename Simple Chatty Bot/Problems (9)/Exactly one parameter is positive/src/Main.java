import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int positive = 0;
        for (int i = 0; i < n; i++){
            if (scanner.nextInt()>0) {
                positive++;
            }
        }
        System.out.println(positive == 1);
        // put your code here
    }
}