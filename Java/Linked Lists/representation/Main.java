
class LinkedList{
    class Node{
        int data;
        Node head=null;
        Node tail=null;
        Node temp;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        void addtoNext(int x){
            Node newnode=new Node(x);
            if(head==null){
                head=tail=newnode;
               
                
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        void removefromEnd(){
            if(head==null){
                System.out.println("Empty..");
            }
            else if(head==tail){
                temp=head;
                head=null;
                tail=null;
                
            }
        }



    }
}
class Main{

}