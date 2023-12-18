// You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

// Example 1:

// Input:
// N = 4
// A[] = {1, 2, 3, 4}
// Output:
// 1 3
// Example 2:

// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 1 3 5
// Your Task:
// Since this is a function problem, you just need to complete the provided function print() which takes A and n as input parameters and print the resultant array in the function itself. You have to print the final number of array ending with a space as Printing of newline character is taken care in driver code itself.

// Constraints:
// 1 <= N <= 105
// 1 <= Ai <= 105

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class Alternate
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
             GfG gfg = new GfG();
             gfg.print(arr, n);
             System.out.println();
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// arr[] is the array 
// n is the number of elements in array.
class GfG
{
    public static void print(int arr[], int n)
    {
        for (int j = 0; j < n; j += 2) 
        {
            System.out.print(arr[j] + " ");
        }
    }
}