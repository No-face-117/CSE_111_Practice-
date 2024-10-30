// Counts the number of vowels and consonants in that word. 

import java.util.Scanner;

public class CSE_111_Practice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String now = scan.nextLine();

        int ak = now.length() - 1;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean flag = true;
        int vc = 0; 
        int cc = 0;
        
        for (int i = 0; i < now.length(); i++) {
            char c_f = now.charAt(i);

            if (c_f >= 'a' && c_f <= 'z' || c_f >= 'A' && c_f <= 'Z') {
                for (int j = 0; j < now.length(); j++) {
                    char c_e =  vowels[j];

                    if (c_e != c_f) {
                        flag = false;
                        //break;
                    }
                    else if (c_e == c_f) {
                        flag = true;
                        break;
                    }
                    else{}
                }
            }else{}

            
            if (flag == true) {
                vc ++;
            }
            else if (flag == false) {
                cc ++;
            }
        }

        System.out.println("Vowels : " + vc);
        System.out.println("Consonant : " + cc);
    }
}