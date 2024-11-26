package Top100Liked;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class T100_1st {
    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> combs = new ArrayList<>();
        if (digits.isEmpty()){
            return combs;
        }
        backtrack(0, digits, "", combs);
        return combs;
    }
    static void backtrack(int idx, String digits, String comb, ArrayList<String> combs){
        String[][] letters = {
                {},
                {},
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"},
                {"j","k","l"},
                {"m","n","o"},
                {"b","q","r","s"},
                {"t","u","v"},
                {"w","x","y","z"}
        };
        if (idx == digits.length()){
            combs.add(comb);
        }else {
            String[] posLetters = letters[digits.charAt(idx) - 48];
            for (int i = 0; i < posLetters.length ; i++){
                backtrack(idx+1, digits, comb + posLetters[i], combs);
            }

        }
    }
}