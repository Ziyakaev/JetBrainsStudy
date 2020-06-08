import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =3;
        Set nums = new HashSet();
        for(int i = 0; i< n; i++){
            nums.add(scanner.nextInt());
        }

        System.out.println(n==nums.size());
        // put your code here
    }
}