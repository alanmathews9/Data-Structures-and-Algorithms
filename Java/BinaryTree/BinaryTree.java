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
        public static void preOrder(Node root){
            if(root==null){
                return ;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
            
        }
        public static void inOrder(Node root){
            if(root==null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
            
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
      Bt tree=new Bt();
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      Node root=tree.buildtree(nodes);
      System.out.println(root.data);
      System.out.println("Pre order traversal: ");
      tree.preOrder(root);
      System.out.println();
      System.out.println("In order traversal: ");
      tree.inOrder(root);
      System.out.println();
      System.out.println("Post order traversal: ");
      tree.postOrder(root);
    }
}