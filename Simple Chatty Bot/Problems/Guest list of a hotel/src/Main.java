//put imports you need here

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = new ArrayList<>();
        while (scanner.hasNext()){
            guests.add(scanner.next());
        }
        Collections.reverse(guests);
        for (int i =0; i< guests.size(); i++){
            System.out.println(guests.get(i));
        }
        // put your code here
    }
}