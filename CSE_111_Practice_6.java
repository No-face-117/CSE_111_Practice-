//  prints the number of odd numbers in each row.

import java.util.Scanner;

public class CSE_111_Practice_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] arr = {{4, 5, 6, 9}, {1, 2, 4}, {11, 12, 13}};

        int ak = 0; int o_c = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j< arr[i].length) {
                ak = arr[i][j];
                if (ak % 2 != 0) {
                    o_c++;
                }
                else{}
                
                j++;
            }
            System.out.println("Row " + i + " odd count = " + o_c);
            o_c = 0;
        }
        System.out.println( );

        scan.close();
    }
}

//     0 1 2 3 4       ---------
//   0 X X X X X       X X X X X     | X X X X X 
//   1 X X X X X       X X X X X     | X X X X X
//   2 X X X X X       X X X X X     | X X X X X 
//   3 X X X X X       X X X X X     | X X X X X
//   4 X X X X X       X X X X X     | X X X X X 