import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        String[] arrayStrings = stringInput.split(" ");
        boolean isAlphabetOrder = true;
        for(int i = 0; i < arrayStrings.length-1; i++){
            if (arrayStrings[i].compareTo(arrayStrings[i+1]) > 0){
                isAlphabetOrder = false;
            }
        }

        System.out.println(isAlphabetOrder);
        // put your code here
    }
}