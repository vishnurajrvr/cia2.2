public class Palindrome {
    public static void main(String[] args) {
        // Set the input string directly in the code
        String input = "MALAYALAM";

        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Check if the input is a palindrome
        if (isPalindrome(cleanedInput)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters from the beginning and the end
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
