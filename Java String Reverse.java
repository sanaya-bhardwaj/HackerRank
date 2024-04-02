//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.
Sample Input
madam
Sample Output
Yes

//SOLUTION:

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        // Check if the string is a palindrome
        boolean isPalindrome = true;
        int i = 0, j = A.length() - 1;
        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        // Print Yes if it's a palindrome, otherwise print No
        System.out.println(isPalindrome ? "Yes" : "No");

        sc.close();
    }
}
