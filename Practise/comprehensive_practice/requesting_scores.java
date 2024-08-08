//Six judges are scoring a single participant,discard the highest and the lowest scores//
//Calculate the average of the remaining scores//

import java.util.Scanner;

public class requesting_scores {
    public static void main(String[] args) {

        int[] arr = initData();

        int sum = getSum(arr);

        int max = getMax(arr);

        int min = getMin(arr);

        double avg = ((sum - max - min) * 1.0) / (arr.length - 2);

        System.out.println("The last score:" + avg);

    }


    private static int getMin(int[] arr) {
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    private static int[] initData() {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Scores:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + "th score:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("Please enter the score between 0 and 100");
                i--;
            }
        }
        return arr;
    }
}
