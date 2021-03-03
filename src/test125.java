

//125. Valid Palindrome
public class test125 {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        char[] array = new char[s.length()];
        int count = 0;
        int l = 0, r;
        char a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
            }
            if (Character.isDigit(a) || Character.isLowerCase(a)) {
                array[count++] = a;
            } else {
                continue;
            }
        }
        r = count - 1;
        while (l <= r) {
            if (array[l] == array[r]) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
