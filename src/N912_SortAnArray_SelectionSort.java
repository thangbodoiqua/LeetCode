public class N912_SortAnArray_SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,1,1,2,0,0};
        arr = sort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--){
            int largest = arr[i];
            int index = i;
            for (int j = i - 1; j>= 0; j--){
                if (arr[j] > arr[index]){
                    largest = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = largest;
            arr[index] = temp;
        }

        return arr;
    }
}
