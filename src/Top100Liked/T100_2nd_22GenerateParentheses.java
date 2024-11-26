package Top100Liked;

import java.util.ArrayList;
import java.util.List;

public class T100_2nd_22GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

        public static  void recurse(List<String> res, int left, int right, String s, int n) {
            if (s.length() == n * 2) {
                res.add(s);
                return;
            }

            if (left < n) {
                recurse(res, left + 1, right, s + "(", n);
            }

            if (right < left) {
                recurse(res, left, right + 1, s + ")", n);
            }
        }
}