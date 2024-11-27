package Top100Liked;
import java.util.*;
public class Third_39_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {8,7,4,3};
        System.out.println(combinationSum(candidates, 11));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sums = new ArrayList<>();
        backtrack(sums, candidates, target, new ArrayList<>());
        return sums;
    }

    public static void backtrack(List<List<Integer>> sums, int[] candidates, int tagret, List<Integer> total){
        if(calSum(total) == tagret){
            sums.add(new ArrayList<>(total));
            return;
        }

        if (calSum(total) > tagret){
            return;
        }

        int i = 0;

        if (!total.isEmpty()){
            for (int j = 0; j < candidates.length; j++){
                if (candidates[j] == total.getLast()){
                    i = j;
                }
            }
        }

        for (;i < candidates.length; i++){
            total.add(candidates[i]);
            backtrack(sums, candidates, tagret, total);
            total.removeLast();
        }
    }
    public static int calSum(List<Integer> total){
        int sum = 0;
        for (int i = 0; i < total.size(); i++){
            sum += total.get(i);
        }
        return sum;
    }
}
