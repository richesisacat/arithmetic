package pre.demo.leecode;

public class IsPalindrome {
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        System.out.println(sort(a));
    }

    public static boolean sort(String s) {
        if (s.length() <= 1) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z') || (temp >= '0' && temp <= '9')) {
                if (temp >= 'A' && temp <= 'Z') {
                    temp = (char) (temp - 'A' + 'a');
                }
                sb.append(temp);
            }
        }
        String new_s = sb.toString();
        if (sb.reverse().toString().equals(new_s)) {
            return true;
        } else {
            return false;
        }
    }
}
