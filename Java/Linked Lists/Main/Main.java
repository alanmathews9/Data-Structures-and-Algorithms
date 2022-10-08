
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class LinkedList{
    Node head=null,tail=null;
    
    public void insert(int x){
        Node newnode=new Node(x);
        if(head==null&&tail==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public int size(){
        int i=0;
        Node temp=head;
        if(head==null&&tail==null){
            return 0;
        }
        else{
            while(temp!=null){
                i++;
                temp=temp.next;
            }
        }
        return i;
    }
    public int remove(int pos){
        int value=-1;
        if(head==null&&tail==null){
            return -1;
        }
        else if(pos==0){
            head=head.next;
        }
        else{
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            value=temp.next.data;
            temp.next=temp.next.next;

        }
        return value;
    }
    public void display(){
        if(head==null&&tail==null){
            System.out.println("Empty..");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println("Data: "+temp.data);
                temp=temp.next;
            }
        }
    }
    
    
}
class Main{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.display();
        int removeed=ll.remove(1);
        ll.display();
    }
}