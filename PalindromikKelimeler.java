package Proje6;

public class PalindromikKelimeler {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        return true;
    }

    static boolean isPalindrome1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);         //str reverse'ye yani tersten yazdırılmış kelmieye eşit mi.
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("lebel"));
        System.out.println(isPalindrome1("kayak"));
    }
}
