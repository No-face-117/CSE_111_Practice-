//  Prints tha word whose sum of ASCII characters is the largest. 

import java.util.Scanner;

public class CSE_111_Practice_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = {"Feluda", "Batman", "Sherlock", "Conan"};
        
        int p_c = 0; int big = 0 , temp = 0;
        String neow = ""; String bgk ="";

       for (int x = 0; x < arr.length; x++) {
            neow = arr[x];
           

            for (int i = 0; i < neow.length(); i++) {
                char c_c = neow.charAt(i);

                p_c += (int) c_c; // converts char to its aski int value.
            }

            if (p_c > big) {
                big = p_c;
                bgk = arr[x];
                temp = x;
                p_c = 0;
            }
            else if (p_c < big) {
                p_c = 0;
            }
            else{}
        }

        System.out.println("World : " + bgk);
        System.out.println("Index : " + temp);
        System.out.println("Sum : " + big);
        scan.close();
    }
}