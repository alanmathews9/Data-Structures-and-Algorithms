import java.security.spec.ECPublicKeySpec;
import java.util.Scanner;

import javax.naming.NoPermissionException;
import javax.sound.midi.Synthesizer;

class ll{
    private Node head=null;
    private Node tail=null;
    private int size; 

    public ll(){
        this.size=0;
    }
    public void insertFirst(int x){
        Node newnode=new Node(x);
        newnode.next=head;
        head=newnode;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertEnd(int x){
        Node newnode=new Node(x);
        if(head==null&&tail==null){
            head=newnode;
            tail=newnode;

        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        size++;

    }
    public void addAtPos(int pos,int x){  //after the pos the element will be inserted..
        Node temp=head;
        Node newnode=new Node(x);
        int i=1;
        if(temp==null){
            System.out.println("Empty");
        }
        else if(pos>size||pos<=0){
            System.out.println("Enter valid position values...");
        }
        else{
            while(i<pos){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void addBeforePos(int pos, int x){
        
        if(head==null){
            System.out.println("Empty..");
        }
        else if(pos>size||pos<=0){
            System.out.println("Enter valid position values...");
        }
        else if(pos==1){
            insertFirst(x);
            size++;
        }
        else if(pos==size){
            insertEnd(x);
            size++;
        }
        else{
            Node newnode=new Node(x);
            int i=1;
            Node temp=head;
            while(i<pos-1){
                i++;
                temp=temp.next;

            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty..");
        }
        else{
            while(temp!=null){
                System.out.println("Data: "+temp.value);
                temp=temp.next;
            }
        }
        
    }
    public void deleteFirst(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty..");
        }
        else if(head==tail){
            System.out.println("Deleting: "+head.value);
            head=tail=null;

            size--;
        }
        else{
            System.out.println("Deeleting: "+head.value);
            head=head.next;
            temp.next=null;
            size--;
        }
        
    }
    void deletePos(int pos){
        if(head==null){
            System.out.println("Empty..");
        }
        else if(pos>size||pos<=0){
            System.out.println("Invalid pos");
        }
        else{
            Node temp=head;
            int i=1;
            while(i<pos-1){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("Empty..");

        }
        else if(head==tail){
            System.out.println("Deleting: "+tail.value);
            head=tail=null;
            size--;
        }
        else{
            System.out.println("Deleting: "+tail.value);
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
    }
     class Node{
        int value;
        Node next;
        
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

}

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll linked=new ll();
        int state=0;
        while(state==0){
            System.out.println("1. Enter the data 2. display 3. exit.. 4. Insert end 5. insert after pos 6. Insert at pos 7.Delete first 8. delete last 9. delete pos Enter the coice: ");
            int ch;
            ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter the data: ");
                    int item;
                    item=sc.nextInt();
                    linked.insertFirst(item);
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
                    System.out.println("Enter the item to be added: ");
                    int item;
                    item=sc.nextInt();
                    linked.insertEnd(item);
                    break;
                }
                case 5:{
                    System.out.println("Enter the value: ");
                    int item;

                    item=sc.nextInt();
                    System.out.println("Enter the position at which it has to be inserted: ");
                    int pos;
                    pos=sc.nextInt();
                    linked.addAtPos(pos, item);
                    break;
                }
                case 6:{
                    System.out.println("Enter the data to be inserted: ");
                    int item;
                    item=sc.nextInt();
                    System.out.println("Enter the position at which ita has to be inserted: ");
                    int pos;
                    pos=sc.nextInt();
                    linked.addBeforePos(pos, item);
                    break;
                }
                case 7:{
                    linked.deleteFirst();
                    break;
                }
                case 8:{
                    linked.deleteLast();
                    break;
                }
                case 9:{
                    System.out.println("Enter the pos to be deleted: ");
                    int pos;
                    pos=sc.nextInt();
                    linked.deletePos(pos);
                    break;
                }

            }

        }
    }
}