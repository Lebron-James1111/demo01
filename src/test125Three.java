public class test125Three {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            while (l <= r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l <= r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (l <= r) {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                } else {
                    l++;
                    r--;
                }
            }
        }
        return true;
    }

}