// implememtn queue using 2 stacks

class StackQueu{
    int top1,top2;
    int array[]=new int[20];
    StackQueu(){
        this.top1=-1;
        this.top2=-1;
    }
    void enque(int x){
        if(top1==-1&&top2==-1){
            top1=top2=0;
            array[top1]=x;
        }
        else{
            top1++;
            array[top1]=x;
        }
    }
    void dequeue(){
        if(top1==-1&&top2==-1){
            System.out.println("Emoty");
        }
        else if(top1==top2){
            System.out.println("Removing: "+array[top2]);
            top1=top2=-1;
        }
        else{
            System.out.println("Removing: "+array[top2++]);
        }
    }
    void display(){
        if(top1==-1&&top2==-1){
            System.out.println("Empty");
        }
        else{
            for(int i=top2;i<=top1;i++){
                System.out.println(array[i]);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        StackQueu sq=new StackQueu();
        sq.enque(0);
        sq.enque(1);
        sq.enque(3);
        sq.enque(5);
        sq.display();
        sq.dequeue();
        sq.display();
    }
}
