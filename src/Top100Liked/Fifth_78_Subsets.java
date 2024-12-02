package Top100Liked;
import java.util.*;

public class Fifth_78_Subsets {
    // https://leetcode.com/problems/subsets/solutions/6081850/simple-solution-with-diagrams-in-video-javascript-c-java-python/?envType=study-plan-v2&envId=top-100-liked
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{4,7,1,2}));
    }
    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(subsets, nums, new ArrayList<>());
        return subsets;
    }
    public static void backtrack(List<List<Integer>> subsets, int[] nums, List<Integer> sub) {
        if (!subsets.contains(sub))
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
