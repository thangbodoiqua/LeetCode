package Array;

import java.util.Arrays;

public class Arr_11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int area = 0;
        while (left < right){
            area = Math.max(area, Math.min(height[left],height[right])*(right-left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}
