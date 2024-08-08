package practise;
//shuffle the elements in array {1,2,3,4,5} in random

import java.util.Random;

public class change_content_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//get the index randomly
        Random r = new Random();
        int index = r.nextInt(arr.length);
        //shuffle
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }














    }
}
