//Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . 
//You'll find the String class' substring method helpful in completing this challenge.

//Input Format

//The first line contains a single string denoting .
//The second line contains two space-separated integers denoting the respective values of  and .

//Constraints

//String  consists of English alphabetic letters (i.e., ) only.
//Output Format

//Print the substring in the inclusive range from  to .

//Sample Input

//Helloworld
//3 7
//Sample Output

//lowo

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int start  = scan.nextInt();
        int end    = scan.nextInt();
        scan.close();
        
        System.out.println(str.substring(start, end));
    }
}
