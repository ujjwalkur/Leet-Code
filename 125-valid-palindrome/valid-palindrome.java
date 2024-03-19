class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Two pointers approach
        int i = 0, j = s.length() - 1;
        while (i < j) {
            // If characters are not equal, it's not a palindrome
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            // Move pointers towards the center
            i++;
            j--;
        }
        // If pointers meet in the middle, it's a palindrome
        return true;
    }
}
