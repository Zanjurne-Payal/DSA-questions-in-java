package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int[] nodes)
        {
           idx++;
           if(nodes[idx] == -1)return null;
           Node newNode = new Node(nodes[idx]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
        }
    }
    //preorder = data , left , right
    public static void preorder(Node root)//time complexity = (O(n))
    {
        if(root == null)return;
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder = left , data , right
    public static void inorder(Node root)//time complexity = (O(n))
    {
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }
    //inorder = left , right , data
    public static void postorder(Node root)//time complexity = (O(n))
    {
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"  ");
    }
    public static void levelOrder(Node root)//time complexity = (O(n))
    {
        Queue<Node> q = new LinkedList<>();
        if(root == null)return;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(curr.data+"    ");
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
        }
    }
    public static int countNodes(Node root) //complexty = O(n)
    {
        if(root == null)return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public static int sumOfNodes(Node root)
    {
        if(root == null)return 0; // complexity = O(n)
        return sumOfNodes(root.left)+sumOfNodes(root.right)+root.data;
    }
    public static int calculate_height(Node root)
    {
        if(root == null)return 0;
        if(calculate_height(root.left)+1 > calculate_height(root.right)+1)return calculate_height(root.left)+1;
        else return calculate_height(root.right)+1;
    }
    public static int diameter(Node root){
        if(root == null)return 0;
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = calculate_height(root.left)+calculate_height(root.right)+1;
        return Math.max(diameter3, Math.max(diameter1,diameter2));
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht , int diam)
        {
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root)
    {
        if(root == null)return new TreeInfo(0,0);
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht , right.ht)+1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;
        int myDiam = Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myinfo = new TreeInfo(myHeight,myDiam);
        return myinfo;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};   //preorder (data , left , right)
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
       // System.out.println(root.data);
        System.out.println("preorder :");
        preorder(root);
        System.out.println("\nInorder");
        inorder(root);
        System.out.println("\nPostorder");
        postorder(root);
        System.out.println("\nLevelOrder");
        levelOrder(root);
        System.out.println("\n count the number of nodes  "+countNodes(root));
        System.out.println("sum of all nodes data  "+sumOfNodes(root));
        System.out.println("Height of tree "+calculate_height(root));
        System.out.println("Diameter of tree "+diameter(root)+"  "+diameter2(root).diam);
    }
}
