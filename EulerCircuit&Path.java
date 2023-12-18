An Eulerian Path is a path in graph that visits every edge exactly once and it starts and ends up at different indexes. An Eulerian Circuit is an Eulerian Path which starts and ends on the same vertex. Given an undirected acyclic graph with V nodes, and E edges, with adjacency list adj, return 2 if the graph contains an eulerian circuit, else if the graph contains an eulerian path, return 1, otherwise, return 0.

Example 1:

Input: 

Output: 2
Explanation: 
Following is an eulerian circuit in the mentioned graph
1 -> 2 -> 0 -> 1
Example 2:

Input: 

Output: 1
Explanation: 
Following is an eulerian circuit in the mentioned graph
1 -> 0 -> 2
Your Task:
You dont need to read or print anything. Your task is to complete the function isEulerCircuilt() which takes number of vertices in the graph denoted as V and an adjacency list of graph denoted as adj and returns 2 if the graph contains an eulerian circuit, else if the graph contains an eulerian path, it returns 1, otherwise, it will return 0.

Expected Time Complexity: O(V+E) where E is the number of edges in graph.
Expected Space Complexity: O(V)

Constraints:
1 ≤ V, E ≤ 104
1 ≤ adj[i][j] ≤ V-1

// Answers

//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    public class GFG {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tc = scanner.nextInt();
            
            while (tc-- > 0) {
                int V = scanner.nextInt();
                int E = scanner.nextInt();
                
                List<Integer>[] adj = new ArrayList[V];
                for (int i = 0; i < V; i++) {
                    adj[i] = new ArrayList<>();
                }
                
                for (int i = 0; i < E; i++) {
                    int u = scanner.nextInt();
                    int v = scanner.nextInt();
                    adj[u].add(v);
                    adj[v].add(u);
                }
                
                // String x=scanner.nextLine();
                // scanner.nextLine();
                
                Solution obj = new Solution();
                int ans = obj.isEulerCircuit(V, adj);
                System.out.println(ans);
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution{
        public int isEulerCircuit(int V, List<Integer>[] adj) 
        {
            // Initialize an array to store degrees of vertices
            int[] degrees = new int[V];
            
            // Calculate degrees of all vertices
            for (int i = 0; i < V; i++) {
                degrees[i] = adj[i].size();
            }
            
            int oddDegreeCount = 0; // Count of vertices with odd degree
            
            // Count vertices with odd degrees
            for (int i = 0; i < V; i++) {
                if (degrees[i] % 2 != 0) {
                    oddDegreeCount++;
                }
            }
            
            // Check for Eulerian circuit or path
            if (oddDegreeCount == 0) {
                return 2; // Eulerian circuit
            } else if (oddDegreeCount == 2) {
                return 1; // Eulerian path
            } else {
                return 0; // Neither Eulerian circuit nor path
            }
        }
    }