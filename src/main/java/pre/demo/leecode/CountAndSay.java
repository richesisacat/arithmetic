package pre.demo.leecode;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(sort(5));
    }

    public static String sort(int n) {
        if (n <= 0) {
            return "";
        }
        String rel = "1";

        if (n == 1) {
            return rel;
        }

        for (int i = 2; i <= n; i++) {
            rel = sort2(rel);
        }
        return rel;
    }

    public static String sort2(String str) {
        char[] chars = str.toCharArray();

        StringBuilder rel = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            char s = chars[i];
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            rel.append(count).append(s);
        }
        return rel.toString();
    }
}
