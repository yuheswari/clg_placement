/*
 Problem: Build an undirected graph using an adjacency list from user input.

 Input format:
     v e            // v = number of vertices (0..v-1), e = number of edges
     src dest       // repeated e times, each is an undirected edge between src and dest

 Example input:
     4 3
     0 1
     1 2
     2 3

 Adjacency list result:
     0 -> [1]
     1 -> [0, 2]
     2 -> [1, 3]
     3 -> [2]

 Simple diagram:
     0 --- 1 --- 2 --- 3

 Notes:
 - We use an ArrayList of ArrayLists to store neighbors for each vertex.
 - For an undirected graph, we add both (src -> dest) and (dest -> src).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class g {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // 1) Read the number of vertices (v) and edges (e)
                int v = sc.nextInt();
                int e = sc.nextInt();

                // 2) Initialize an empty adjacency list with v buckets (one per vertex)
                List<List<Integer>> graph = new ArrayList<>(v);
                for (int i = 0; i < v; i++) {
                        graph.add(new ArrayList<>());
                }

                // 3) Read e edges and add them in both directions (undirected)
                for (int i = 0; i < e; i++) {
                        int src = sc.nextInt();
                        int dest = sc.nextInt();

                        // Basic validation: ignore edges that reference out-of-range vertices
                        if (src < 0 || src >= v || dest < 0 || dest >= v) {
                                System.out.println("Invalid edge: (" + src + ", " + dest + ") skipped");
                                continue;
                        }

                        graph.get(src).add(dest);
                        graph.get(dest).add(src);
                }

                sc.close();

                // 4) Print the adjacency list so you can see the built graph clearly
                for (int i = 0; i < v; i++) {
                        System.out.println(i + " -> " + graph.get(i));
                }
        }
}