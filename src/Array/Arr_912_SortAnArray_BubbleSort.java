package Array;

public class Arr_912_SortAnArray_BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,1,1,2,0,0};
        arr = sort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
