import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
        HashSet<Node> visited =new HashSet<Node>();
        Node curr=root;
        while(curr!=null&&!visited.contains(curr)){
            if(curr.left!=null&&!visited.contains(curr.left)){
               curr=curr.left; 
            }
         else   if(curr.right!=null&&!visited.contains(curr.right)){
               curr=curr.right; 
            }
            else
            {
                System.out.print(curr.data+" ");
                visited.add(curr);
                curr=root;
            }
        }
        
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }	
}
