import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
    }

//    public static String[] solution(String s) {
//        //Write your code here
//        String[] res = new String[((s.length() + 1) / 2)];
//        if (s.length() % 2 == 0) {
//            for (int i = 0; i < res.length; i++) {
//                res[i] = s.substring(i * 2, i * 2 + 2);
//            }
//        } else {
//            for (int i = 0; i < res.length - 1; i++) {
//                res[i] = s.substring(i * 2, i * 2 + 2);
//            }
//            res[res.length - 1] = s.substring(s.length() - 1) + "_";
//        }
//        return res;
//    }

    public static String[] solution(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }
}
