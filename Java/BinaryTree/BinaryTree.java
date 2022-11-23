import java.util.*;
public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Bt{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
        public static void preOrder(Node root){         //O(n)  (root--->left--->right)
            if(root==null){
                return ;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){          //(left---->root--->right)
            if(root==null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){            //(left------>right---->root)
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    q.add(null);
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int leftNodes=count(root.left);
            int rightNodes=count(root.right);
            return(leftNodes+rightNodes+1);
        }
    }
    public static void main(String[] args) {
      Bt tree=new Bt();
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      Node root=tree.buildtree(nodes);
      System.out.println("Root: ");
      System.out.println(root.data);
      System.out.println("Pre order traversal: ");
      tree.preOrder(root);
      System.out.println();
      System.out.println("In order traversal: ");
      tree.inOrder(root);
      System.out.println();
      System.out.println("Post order traversal: ");
      tree.postOrder(root);
      System.out.println();
      System.out.println("Level Order traversal: ");
      tree.levelOrder(root);
      System.out.println("Count: ");
      System.out.println(tree.count(root));
    }
}