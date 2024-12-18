public class N912_SortAnArray_MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,4,7,1,3,2,6};
        arr = sort(arr, 0,(arr.length-1)/2, arr.length-1);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
    public static int[] sort(int[] arr, int left, int mid, int right){
        if (left < right){
            sort(arr, left, (left+mid)/2,mid);
            sort(arr, mid + 1, (mid+1+right)/2,right);
        }
        int[] c = new int[right - left + 1];
        int curLeft = left;
        int curRight = mid + 1;
        int idx = 0;
        while (curLeft <= mid && curRight <= right){
            if (arr[curLeft] < arr[curRight]){
                c[idx++] = arr[curLeft++];
            }else
                c[idx++] = arr[curRight++];
        }
        while (curLeft <= mid){
            c[idx++] = arr[curLeft++];
        }
        while (curRight <= right){
            c[idx++] = arr[curRight++];
        }
        for (int i = 0; i < c.length; i++){
            arr[left + i] = c[i];
        }
        return arr;
    }
}
