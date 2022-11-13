
public class TenMinWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        System.out.println(isValid(new char[] {'w'}));
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        final int taskNum = 10;
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;
        for (Character ch : walk) {
            if (ch == 'n') n++;
            else if (ch == 's') s++;
            else if (ch == 'w') w++;
            else e++;
        }
        return n == s && w == e && n + s + w + e == taskNum;
    }
}
