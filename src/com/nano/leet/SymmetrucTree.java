

package com/nano/leet;


/*
 3 Approaches: 
 I. My approach: 
    Check if each leveel is symmetric, put them in an arraylist and check for its symmetry by traversion from fromnt and back and check equality
*/




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
/*
 I. My approach: 
    Check if each leveel is symmetric, put them in an arraylist and check for its symmetry by traversion from fromnt and back and check equality
    */
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode node = null;
        List<Integer> l = null;
        while(!q.isEmpty()){
            int s = q.size();
            l = new ArrayList<>();
            for(int i=0;i<s;i++){
                node = q.poll();
                if(node==null)
                    l.add(null);
                else{
                    l.add(node.val);
                //if(node.left!=null){
                    q.offer(node.left);
               // }
                //if(node.right!=null){
                    q.offer(node.right);
               // }
                }
            }
            for(int i=0;i<=(s)/2;i++){
                if(l.get(i)==null && l.get(s-i-1)==null)
                    continue;
                else if(l.get(i)!=l.get(s-i-1))
                    return false;
            }
        }
        return true;
    }
    
    
    public boolean isSymmetric(TreeNode root) {
    return isMirror(root, root);
}

/*
Leetcode: Aprach 2: RECUSRSIVE
Two trees are a mirror reflection of each other if:

Their two roots have the same value.
The right subtree of each tree is a mirror reflection of the left subtree of the other tree.
Complexity Analysis

Time complexity : O(n)O(n). Because we traverse the entire input tree once, the total run time is O(n)O(n), where nn is the total number of nodes in the tree.

Space complexity : The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in O(n)O(n). Therefore, space complexity due to recursive calls on the stack is O(n)O(n) in the worst case.

*/
public boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return (t1.val == t2.val)
        && isMirror(t1.right, t2.left)
        && isMirror(t1.left, t2.right);
}
  
  /*
  Approach 3: Iterative
Instead of recursion, we can also use iteration with the aid of a queue. Each two consecutive nodes in the queue should be equal, and their subtrees a mirror of each other. Initially, the queue contains root and root. Then the algorithm works similarly to BFS, with some key differences. Each time, two nodes are extracted and their values compared. Then, the right and left children of the two nodes are inserted in the queue in opposite order. The algorithm is done when either the queue is empty, or we detect that the tree is not symmetric (i.e. we pull out two consecutive nodes from the queue that are unequal).
Complexity Analysis

Time complexity : O(n)O(n). Because we traverse the entire input tree once, the total run time is O(n)O(n), where nn is the total number of nodes in the tree.

Space complexity : There is additional space required for the search queue. In the worst case, we have to insert O(n)O(n) nodes in the queue. Therefore, space complexity is O(n)O(n).


*/
public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    q.add(root);
    while (!q.isEmpty()) {
        TreeNode t1 = q.poll();
        TreeNode t2 = q.poll();
        if (t1 == null && t2 == null) continue;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        q.add(t1.left);
        q.add(t2.right);
        q.add(t1.right);
        q.add(t2.left);
    }
    return true;
}

}
