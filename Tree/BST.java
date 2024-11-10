package Tree;
import java.util.*;
public class BST {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
        static public Node buildTree(Node root , int val)
        {
            if(root == null){
                root = new Node(val);
                return root;
            }
            if(root.data > val)
            {
                root.left = buildTree(root.left , val);
            }
            else
            {
                root.right = buildTree(root.right , val);
            }
            return root;
        }
        static boolean search(int val, Node root)
        {
            if(root == null)return false;
            if(root.data == val)return true;
            else if(root.data > val) return search(val,root.left);
            else return search(val,root.right);
        }
        static void inorder(Node root)
        {
            if(root == null)return;
            inorder(root.left);
            System.out.print(root.data+"  " );
            inorder(root.right);
        }
        static Node InorderSuccessor(Node root)
        {
            while(root.left != null)
            {
                root = root.left;
            }
            return root;
        }
        static Node delete(Node root , int val)
        {
            if(root == null)return null;
            if(root.data == val)
            {
                if(root.left == null && root.right == null) return null;
                if(root.left == null)return root.right;
                else if(root.right == null)return root.left;
                else{
                    Node is = InorderSuccessor(root.right);
                    root.data = is.data;
                    root.right = delete(root.right , is.data);
                }
            }
            else if(root.data > val)
            {
                root.left = delete(root.left , val);
            }
            else
            {
                root.right = delete(root.right , val);
            }
            return root;
        }
        static void print_in_range(Node root , int x , int y)
        {
            if(root == null)return;
            if(root.data >= x && root.data <= y)
            {
                print_in_range(root.left , x ,y);
                System.out.print(root.data+"  ");
                print_in_range(root.right , x ,y);
            }
            else if(root.data >= y)
            {
                print_in_range(root.left , x ,y);
            }
            else
            {
                print_in_range(root.right , x ,y);
            }
        }
        static void root_to_leaf(Node root,ArrayList<Integer> list)
        {
            if(root == null)
            {
                return;
            }
            list.add(root.data);
            if(root.left == null && root.right == null)
            {
                System.out.println(list);
            }
           else
            {
                root_to_leaf(root.left , list);
                root_to_leaf(root.right , list);
            }
            list.remove(list.size()-1);
        }
    public static void main(String[] args) {
        int[] nodes = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildTree(root , nodes[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(1 , root));
        System.out.println(search(7,root));
        delete(root , 1);
        inorder(root);
        System.out.println();
        System.out.println("Print in range");
        print_in_range(root , 6 , 10);
        System.out.println();
        root_to_leaf(root , new ArrayList<Integer>());
    }
}