import java.util.Scanner;

class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        checkLanguache();
    }

    private static void checkLanguache(){
        int language = scanner.nextInt();
        switch (language){
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number ");
        }
    }
}