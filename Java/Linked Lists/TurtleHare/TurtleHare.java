class LinkedList{class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}
Node head=null,tail=null;
    public void insert(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public int getMiddle(){
        if(head==null){
            return -1;
        }
        Node hare=head,turtle=head;
        while(hare.next!=null&&hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return (turtle.data);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
class TurtleHare{
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.insert(1);
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(5);
        System.out.println((ls.getMiddle()));
        System.out.println("Elements:");
        ls.display();
        
    }
}