import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char [] vowels = {'a', 'e', 'o', 'A', 'O', 'E', 'I', 'i', 'U', 'u'};
        boolean isVowel = false;
        int i = 0;
        while (i < vowels.length && (vowels[i] !=ch)){
            i++;
            }
        return isVowel;// write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}