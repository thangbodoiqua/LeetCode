package Top100Liked;
import java.lang.reflect.Array;
import java.util.*;
public class fifth_78_Subsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{3,2,1}));
    }
    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(subsets, nums, new ArrayList<>());
        return subsets;
    }
    public static void backtrack(List<List<Integer>> subsets, int[] nums, List<Integer> sub) {
        subsets.add(new ArrayList<>(sub));
        for (int i = 0; i < nums.length; i++){
            if (sub.size() > 0 && sub.getLast() >= nums[i]) {
                continue;
            }
            sub.add(nums[i]);
            backtrack(subsets, nums, sub);
            sub.remove(sub.getLast());
        }

    }

}
