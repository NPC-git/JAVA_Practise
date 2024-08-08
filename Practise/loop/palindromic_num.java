package prcatise;

import java.util.Scanner;

public class palindromic_num {
    public static void main(String[] args) {
        /*input a number and
        check if it reads the same forward and backward (like 1221 or 131)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        int y = i;

        int num = 0;
        while(i != 0){
            //get each number from right to left
            int one = i % 10;
            i = i / 10;
            //add the number to the rightmost
            num = num * 10 + one;
        }

        if (num == y){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }





    }
}
