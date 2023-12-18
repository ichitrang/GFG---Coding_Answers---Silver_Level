// Given two strings A and B consisting of lowercase english characters. Find the characters that are not common in the two strings. 

// Note :- Return the string in sorted order.

// Example 1:

// Input:
// A = geeksforgeeks
// B = geeksquiz
// Output: fioqruz
// Explanation: 
// The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
// are either present in A or B, but not in both.
// Example 2:

// Input:
// A = characters
// B = alphabets
// Output: bclpr
// Explanation: The characters 'b','c','l','p','r' 
// are either present in A or B, but not in both.

// Your Task:  
// You dont need to read input or print anything. Complete the function UncommonChars() which takes strings A and B as input parameters and returns a string that contains all the uncommon characters in sorted order. If no such character exists return "-1".


// Expected Time Complexity: O(M+N) where M and N are the sizes of A and B respectively.
// Expected Auxiliary Space: O(M+N)  


// Constraints:
// 1<= M,N <= 104
// String may contain duplicate characters.

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        
        HashSet<Character> setA = new HashSet<>();
        HashSet<Character> setB = new HashSet<>();
        
        
        for (char ch : A.toCharArray()) {
            setA.add(ch);
        }
        
        for (char ch : B.toCharArray()) {
            setB.add(ch);
        }
        
        
        HashSet<Character> uncommonSet = new HashSet<>();
        
        
        for (char ch : setA) {
            if (!setB.contains(ch)) {
                uncommonSet.add(ch);
            }
        }
        
        // Add characters from B that are not in A
        for (char ch : setB) {
            if (!setA.contains(ch)) {
                uncommonSet.add(ch);
            }
        }
        
        // If no uncommon characters, return "-1"
        if (uncommonSet.isEmpty()) {
            return "-1";
        }
        
        // Convert set to array and sort it
        Character[] uncommonArray = uncommonSet.toArray(new Character[0]);
        Arrays.sort(uncommonArray);
        
        // Convert array to string and return the result
        StringBuilder result = new StringBuilder();
        for (char ch : uncommonArray) {
            result.append(ch);
        }
        
        return result.toString();
    }
}