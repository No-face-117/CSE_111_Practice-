//  The number of words that are palindrome in an array. 

import java.util.Scanner;

public class CSE_111_Practice_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = {"mom", "1aa1", "tree", "kayak"};
        
        int p_c = 0;

        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            int ak = now.length() - 1;

            char c_f = now.charAt(0); 
            char c_e = now.charAt(ak); 
            boolean flag = false;

            if (c_f != c_e) {
                System.out.println(now + " is NOT a palindrome!");
            }
            else if (c_f == c_e) {
            for (int x = 1; x < now.length(); x++) {
                    ak --;    
                    c_f = now.charAt(x);
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
                    p_c ++;
                }
                else {}
            }
            else{}
        }

        System.out.println("Palindrome count = " + p_c);
        scan.close();
    }
}