class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Link{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;
    head=newNode;
    newNode=temp.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

}
public class linkedlistbeg {
    public static void main(String[] args) {
        Link list=new Link();
        list.insert(23);
        list.insert(73);
        list.insert(46);
        list.display();
    }
}
