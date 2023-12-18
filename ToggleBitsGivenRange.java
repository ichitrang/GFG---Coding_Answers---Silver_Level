// Given a non-negative number N and two values L and R. The problem is to toggle the bits in the range L to R in the binary representation of N, i.e, to toggle bits from the rightmost Lth bit to the rightmost Rth bit. A toggle operation flips a bit 0 to 1 and a bit 1 to 0. Print N after the bits are toggled.

 

// Example 1:

// Input:
// N = 17 , L = 2 , R = 3
// Output:
// 23
// Explanation:
// (17)10 = (10001)2.  After toggling all
// the bits from 2nd to 3rd position we get
// (10111)2 = (23)10
// Example 2:

// Input:
// N = 50 , L = 2 , R = 5
// Output:
// 44
// Explanation:
// (50)10 = (110010)2.  After toggling all
// the bits from 2nd to 5th position we get
// (101100)2 = (44)10
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function toggleBits() which takes 3 Integers N,L and R as input and returns the answer.

 

// Expected Time Complexity: O(1)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 1 <= N <= 105
// 1 <= L<=R <= Number of Bits in N

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int L = Integer.parseInt(S[1]);
            int R = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.toggleBits(N,L,R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int toggleBits(int N , int L , int R) {
        // Create a mask to toggle bits within the range [L, R]
        int mask = ((1 << R) - 1) ^ ((1 << (L - 1)) - 1);

        // Toggle the bits using XOR operation with the mask
        return N ^ mask;
    }
};