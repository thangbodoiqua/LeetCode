package Array;

public class Arr_912_SortAnArray_InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,1,1,2,0,0};
        arr = sort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i - 1; j >= 0; j--){
                if (arr[j+1] >= arr[j]){
                    break;
                }
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        return arr;
    }
}
