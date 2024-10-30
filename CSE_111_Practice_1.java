// Detects  whether that word is a palindrome or not.

import java.util.Scanner;

public class CSE_111_Practice_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String now = scan.nextLine();

        int ak = now.length() - 1;
        char c_f = now.charAt(0); char c_e = now.charAt(ak); 
        boolean flag = false;

        if (c_f != c_e) {
            System.out.println(now + " is NOT a palindrome!");
        }
        else if (c_f == c_e) {
           for (int i = 1; i < now.length(); i++) {
                ak --;    
                c_f = now.charAt(i);
                c_e = now.charAt(ak);

                if (c_f != c_e) {
                    flag = false;
                }
                else if (c_f == c_e) {
                    flag = true;
                }
                else{}
            } 

            if (flag) {
                System.out.println(now + " is a palindrome!");
            }
            else {System.out.println(now + " is NOT a palindrome!");}
        }
        else{}
    }
}