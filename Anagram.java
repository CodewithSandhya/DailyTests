import java.util.Arrays;
import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Get the two integers from the user
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        // Convert integers to strings
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        // Check if the sorted versions of the strings are equal
        if (areAnagrams(str1, str2)) {
            System.out.println("The integers are anagrams.");
        } else {
            System.out.println("The integers are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
