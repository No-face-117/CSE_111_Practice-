//  Finds the unique letters in a word.

import java.util.Scanner;

public class CSE_111_Practice_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String now = scan.nextLine();

        String neow = "";

        for (int i = 0; i < now.length(); i++) {
            char c_c = now.charAt(i);

            // Check if the character is a letter
            if ((c_c >= 'a' && c_c <= 'z') || (c_c >= 'A' && c_c <= 'Z')) {
                // Add to uniqueChars if it's not already present
                if (neow.indexOf(c_c) == -1) {
                    neow += c_c;
                }
            }
        }

        System.out.println("Unique letters: " + neow);
        scan.close();
    }
}