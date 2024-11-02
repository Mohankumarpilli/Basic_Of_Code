import java.io.*;
import java.util.*;

class tree {

    static class Node {
        int cost;
        Node[] children;
        Node parent;

        Node(int cost) {
            this.cost = cost;
            children = null;
            parent = null;
        }
    }
    static class SalesPath {

        int getCheapestCost(Node rootNode) {
            return helper(rootNode, 0);
        }
        int helper(Node root, int currentCost){

            // Helper method to recursively find the minimum cost path
                if (root == null) {
                    return Integer.MAX_VALUE;  // If root is null, return a large number
                }

                // Add current node's cost to the total path cost
                currentCost += root.cost;

                // If the node is a leaf node, return the total cost for this path
                if (root.children == null || root.children.length == 0) {
                    return currentCost;
                }

                // Initialize minCost to a large value to track the minimum cost path from this node
                int minCost = Integer.MAX_VALUE;

                // Recursively find the minimum cost among all children
                for (Node child : root.children) {
                    minCost = Math.min(minCost, helper(child, currentCost));
                }

                return minCost;
        }
    }

    /*********************************************
     * Driver program to test above method     *
     *********************************************/

    public static void main(String[] args) {
//        Node root = new Node(0);
//        root.children = new Node[]{
//                new Node(5),
//                new Node(3),
//                new Node(6)
//        };
//        root.children[0].children = new Node[]{new Node(4)};
//        root.children[1].children = new Node[]{new Node(2), new Node(0)};
//        root.children[1].children[0].children = new Node[]{new Node(1)};
//        root.children[1].children[0].children[0].children = new Node[]{new Node(1)};
//        root.children[2].children = new Node[]{new Node(1)};
//
//        SalesPath sp = new SalesPath();
//        System.out.println(sp.getCheapestCost(root)); // Output should be 7
        int sum = 0;
        List<String> ls = Arrays.asList("apple","mango","guava");
        Comparator<String> cmp = (s1,s2) -> s2.compareTo(s1);
        Collections.sort(ls,cmp);
        System.out.println(ls);
    }
}