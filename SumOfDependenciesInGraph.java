Given a directed graph with V nodes and E edges, if there is an edge from u to v, then we will say that u depends on v. Number of Dependencies (NoD) for a node x is the total count of nodes that x depends upon. Find out the sum of number of dependencies of every node.

Example 1:

Input:
V = 4
E = 4
Edges = { {0,2}, {0,3}, {1,3}, {2,3} }

Output:
4
Explanation:
For the graph in diagram, s
A depends on C and D i.e. A's NoD is 2, 
B depends on D i.e. B's NoD is 1,
C depends on D i.e. D's NoD is 1,
and D depends on none.
Hence answer -> 0 + 1 + 1 + 2 = 4
Example 2:

Input:
V = 4
E = 3
Edges = { {0,3}, {0,2}, {0,1} }
Output:
3
Explanation:
The sum of dependencies=3+0+0+0=3.
Your Task:
You don't need to read input or print anything. Your task is to complete the function sumOfDependencies() which takes the adj (Adjacency list) and V (Number of nodes) as input parameters and returns the total sum of Number of Dependencies of all nodes.
Expected Time Complexity: O(V)
Expected Auxillary Space: O(1)

Constraints:
1 <= V <= 105
1 <= E <= 105

0 <= Edges[i][0], Edges[i][1] <= V-1

// Answer

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>(N);
            for (int i = 0; i < N; i++) adj.add(new ArrayList<Integer>());
            String S1[] = read.readLine().split(" ");
            for (int i = 0; i < 2 * M; i += 2) {
                x = Integer.parseInt(S1[i]);
                y = Integer.parseInt(S1[i + 1]);
                adj.get(x).add(y);
            }
            Solution ob = new Solution();
            System.out.println(ob.sumOfDependencies(adj, N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int sumOfDependencies = 0;

        for (int i = 0; i < V; i++) {
            sumOfDependencies += adj.get(i).size();
        }

        return sumOfDependencies;
    }
};