#include <vector>

using namespace std;

class Solution {
public:
    void dfs(int node, const vector<vector<int>>& adj, vector<bool>& visited, int& vertexCount, int& edgeCount) {
        visited[node] = true;
        vertexCount++;
        edgeCount += adj[node].size(); // Sum up the degrees of all nodes in this component
        
        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, vertexCount, edgeCount);
            }
        }
    }

    int countCompleteComponents(int n, vector<vector<int>>& edges) {
        // Step 1: Build the adjacency list
        vector<vector<int>> adj(n);
        for (const auto& edge : edges) {
            adj[edge[0]].push_back(edge[1]);
            adj[edge[1]].push_back(edge[0]);
        }
        
        vector<bool> visited(n, false);
        int completeComponentsCount = 0;
        
        // Step 2: Iterate through all vertices
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                int vertexCount = 0;
                int edgeCount = 0;
                
                // Traverse the current component
                dfs(i, adj, visited, vertexCount, edgeCount);
                
                // Step 4: Check if the component is complete
                // Since it's an undirected graph, edgeCount equals the sum of degrees, which is 2 * E
                if (edgeCount == vertexCount * (vertexCount - 1)) {
                    completeComponentsCount++;
                }
            }
        }
        
        return completeComponentsCount;
    }
};