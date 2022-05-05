import java.util.Scanner;

class dLinkedList{
    Node head=null;
    Node tail=null;
    int size;
    dLinkedList(){
        this.size=0;
    }
    
    void addBeg(int x){
        Node newnode=new Node(x);
        if(head==null&&tail==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    Node find(int x){
        Node temp=head;
        if(head==null){
            return null;
        }
        while(temp!=null){
            if(temp.val==x){
                return temp;
            }
        }
        return null;
    }
    void insertBeforeNode(int x,int pos){
        Node temp=find(pos);
        if(head==null){
            System.out.println("Empty..");
        }
        else{
            Node newnode =new Node(x);
            newnode.next=temp;
            newnode.prev=temp.prev;
            temp.prev.next=newnode;
            temp.prev=newnode;
        }
        

    }
    void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty..");
        }
        else{
            while(temp!=null){
                System.out.println("Data: "+temp.val);
                temp=temp.next;
            }
        }
       
    }
    void revDisplay(){
        Node temp=tail;
        if(tail==null){
            System.out.println("E,pty..");
        }
        else{
            while(temp!=null){
                System.out.println("Data: "+temp.val);
                temp=temp.prev;
            }
        }
    }
    void addEnd(int x){
        Node newnode=new Node(x);
        if(tail==null){
            head=tail=newnode;
        }
        else{
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
        }
    }
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int x){
            this.val=x;
            this.next=null;
            this.prev=null;
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int state=0;
        dLinkedList linked=new dLinkedList();
        while(state==0){
            System.out.println("1. insert beginning 2. display 3. exit 4. reverse printing 5.add end ");
            int ch;
            ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter the value to be inserted: ");
                    int item;
                    item=sc.nextInt();
                    linked.addBeg(item);
                    break;
                }
                case 2:{
                    linked.display();
                    break;
                }
                case 3:{
                    state=1;
                    break;
                }
                case 4:{
                    linked.revDisplay();
                    break;
                }
                case 5:{
                    System.out.println("Enter the data to be inserted: ");
                    int item;
                    item=sc.nextInt();
                    linked.addEnd(item);
                    break;
                }
            }
            
        }
    }
}
