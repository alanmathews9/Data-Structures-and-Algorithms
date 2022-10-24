import java.text.BreakIterator;

public class Main{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        public static Node createBinaryTree(int nodes[]){
           if(idx<(nodes.length-1)){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=createBinaryTree(nodes);
            newnode.right=createBinaryTree(nodes);
            return newnode;
        }
    
           
        return null;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,6,-1,-1,5,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.createBinaryTree(nodes);
        System.out.println(root.data);
    }
}