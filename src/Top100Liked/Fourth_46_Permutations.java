package Top100Liked;
import java.util.*;
public class Fourth_46_Permutations {
    //https://leetcode.com/problems/permutations/?envType=study-plan-v2&envId=top-100-liked
    public static void main(String[] args) {
        System.out.println(permute(new int[]{0,1}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutes = new ArrayList<>();
        backtrack(permutes, nums, new ArrayList<>());
        return permutes;
    }

    public static void backtrack(List<List<Integer>> permutes, int[] nums, List<Integer> permute){
        if (permute.size() == nums.length){
            permutes.add(new ArrayList<>(permute));
        }
        for (int i = 0; i < nums.length;i++){
            if (permute.contains(nums[i])) {
                continue;
            }else {
                permute.add(nums[i]);
                backtrack(permutes, nums, permute);
                permute.remove(permute.getLast());
            }
        }
    }
}