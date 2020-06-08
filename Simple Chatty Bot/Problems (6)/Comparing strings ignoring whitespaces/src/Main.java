import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s.replaceAll(" ","").equals(s2.replaceAll(" ","")));
        // put your code here
    }
}