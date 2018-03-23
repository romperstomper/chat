package chat;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("gimme: ");
        ArrayList<String> response = new ArrayList<String>();
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext() == true) {
            response.add(scanner.next());
        }
        (response).forEach(System.out::println);
    }
}
