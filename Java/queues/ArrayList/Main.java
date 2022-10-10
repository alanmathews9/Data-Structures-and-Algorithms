import java.util.*;
class QArray{
     ArrayList<Integer>queue=new ArrayList<>();
    int front,rear;
    QArray(){
        this.front=-1;
        this.rear=-1;
    }
    void insert(int x){
        if(front==-1&&rear==-1){
            this.rear++;
            this.front++;
            queue.add(x);
        }
        else{
            this.rear++;
            queue.add(x);
        }
    }
    int remove(){
        if(front==-1&&rear==-1){
            return -1;
        }
        else if(front==rear){
            int value=queue.get(front);
            this.front=this.rear=-1;
            return value;
        }
        
            int value=queue.get(front);
            this.front++;
            return value;
        
        
    }
    int peek(){
        if(front==-1&&rear==-1){
            return -1;
        }
        return queue.get(front);
    }
    void display(){
        if(front==-1&&rear==-1){
            System.out.println("Emoty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(queue.get(i));
        }

    }
}
class Main{
    public static void main(String[] args) {
        QArray Q=new QArray();
        Q.insert(0);
        Q.insert(1);
        Q.insert(3);
        Q.display();
       int v= Q.remove();
        Q.display();
    }
}