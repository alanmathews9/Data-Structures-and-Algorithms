
class LinkedListQueue{
    
    class Node{
        int data;
        Node next;

        Node(int x){
            this.data=x;
            this.next=null;
        }

    }
    Node front,rear;
    LinkedListQueue(){
        this.front=null;
        this.rear=null;
    }
    void insert(int x){
        Node newnode=new Node(x);
        if(front==null&&rear==null){
            
            this.front=this.rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }
    void delete(){
        if(front==null&&rear==null){
            System.out.println("Empty Queue...");
        }
        else{
            int value=front.data;
            System.err.println("Deleting: "+value);
            front=front.next;
        }
    }
    void display(){
        if(front==null&&rear==null){
            System.out.println("Empty linked list..");
        }
        else{
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }
    }
    boolean isEmpty(){
        return (front==null&&rear==null);
    }
    
    void peek(){
        if(front==null&&rear==null){
            System.out.println("Empty");
        }
        else{
            System.out.println(front.data);
        }
    }

}
class Main{
    public static void main(String[] args) {
        LinkedListQueue lq=new LinkedListQueue();
        lq.insert(0);
        lq.insert(1);
        lq.insert(2);
        lq.display();
        lq.delete();
        lq.display();
    }
}