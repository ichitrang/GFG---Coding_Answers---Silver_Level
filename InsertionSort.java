// The task is to complete the insert() function which is used to implement Insertion Sort.


// Example 1:

// Input:
// N = 5
// arr[] = { 4, 1, 3, 9, 7}
// Output:
// 1 3 4 7 9
// Example 2:

// Input:
// N = 10
// arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output:
// 1 2 3 4 5 6 7 8 9 10

// Your Task: 
// You don't have to read input or print anything. Your task is to complete the function insert() and insertionSort() where insert() takes the array, it's size and an index i and insertionSort() uses insert function to sort the array in ascending order using insertion sort algorithm. 

// Expected Time Complexity: O(N*N).
// Expected Auxiliary Space: O(1).


// Constraints:
// 1 <= N <= 1000
// 1 <= arr[i] <= 1000

// Answer

//{ Driver Code Starts
    import java.util.*;
    import java.lang.Math;
    
    class Sorting
    {
        
        static void printArray(int arr[],int size)
        {
            int i;
            for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int a[] = new int[n];
            
                for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
                
                 new Solution().insertionSort(a,n);
                 printArray(a,n);
                
            t--;
            }
            
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
      static void insert(int arr[],int i)
      {
           int key = arr[i];
            int j = i - 1;
    
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
      }
      //Function to sort the array using insertion sort algorithm.
      public void insertionSort(int arr[], int n)
      {
          for (int i = 1; i < n; ++i)
            {
                insert(arr, i);
            }
      }
    }