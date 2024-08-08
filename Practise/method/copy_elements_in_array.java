/*Define a method copyOfRange(int[] arr, int from, int to)
  copy the elements in an array from arr[from] to arr[to] and  put them in a new array
  return needed*/

public class copy_elements_in_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int[] copyarr = copyOfRange(arr, 3,7);
        for(int i = 0; i < copyarr.length; i++){
            System.out.print(copyarr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newarr = new int[to - from];
        int index = 0;
        for (int i = from; i < to;i++){
            newarr[index] = arr[i];
            index ++;
        }

        return newarr;
    }

























}
