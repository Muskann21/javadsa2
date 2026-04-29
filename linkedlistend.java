class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class link{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    }

public class linkedlistend {
    public static void main(String[] args) {
        link list=new link();
        list.insert(64);
        list.insert(29);
        list.insert(35);
        list.display();
    }
    
}
