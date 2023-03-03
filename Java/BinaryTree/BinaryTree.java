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

        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int left=countNodes(root.left);
            int right=countNodes(root.right);
            return(left+right+1);
        }
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftSum=sumOfNodes(root.left);
            int rightSum=sumOfNodes(root.right);
            return (leftSum+rightSum+root.data);
        }
        public static int heightCalculate(Node root){
            if(root==null){
                return 0;
            }
           int leftHeight=heightCalculate(root.left);
           int rightHeight=heightCalculate(root.right);
           return(Math.max(leftHeight,rightHeight)+1);
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int diam1=diameter(root.left);
            int diam2=diameter(root.right);
            int diam3=diam1+diam2+1;
            return(Math.max(diam1,Math.max(diam2, diam3)));
        }
        
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
           return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3= left.ht+right.ht+1;
        int myDiam=Math.max(diam1,Math.max(diam2,diam3));
        TreeInfo resultInfo=new TreeInfo(myHeight, myDiam);
        return resultInfo;
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
      System.out.println(tree.countNodes(root));
      System.out.println();
      System.out.println("Sum of Nodes: ");
      System.out.println(tree.sumOfNodes(root));
      System.out.println();
      System.out.println("Height: ");
      System.out.println(tree.heightCalculate(root));
      System.out.println();
      System.out.println("Diameter: ");
      System.out.println(tree.diameter(root));
      System.out.println();
      System.out.println("Aproach 2: ");
      System.out.println(diameter2(root).diam);

    }
}