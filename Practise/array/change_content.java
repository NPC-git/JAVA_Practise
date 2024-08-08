package practise;
//change array {1,2,3,4,5}to{5,2,3,4,1}

public class change_content {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            for(i = 0; i <arr.length; i++){
                System.out.print(arr[i]);
            }
        }













    }
}
