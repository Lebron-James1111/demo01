public class test125Two {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("O2pp2o");
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        s = filter(s);
        return compare(s);
    }

    //反转
    private static boolean compare(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    //过滤
    private static String filter(String s) {
        int len = s.length();
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
