
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses(")7>()=B(y<ZR"));
        System.out.println(validParentheses("()"));
        System.out.println(validParentheses("())"));
        System.out.println(validParentheses("32423(sgsdg)"));
        System.out.println(validParentheses("(dsgdsg))2432"));
        System.out.println(validParentheses("adasdasfa"));
    }

    public static boolean validParentheses(String parens) {
        int countOpenParens = 0;
        int countClosedParens = 0;
        for (int i = 0; i < parens.length(); i++) {
            if ("(".equals(parens.substring(i, i + 1))) countOpenParens++;
            if (")".equals(parens.substring(i, i + 1))) countClosedParens++;
            if (countOpenParens < countClosedParens) break;
        }
        return countOpenParens == countClosedParens;
    }
}
