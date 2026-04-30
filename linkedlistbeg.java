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
        newNode.next=head;
        head=newNode;
    }
    void insertmid(int data){
        Node newNode=new Node(data);
        Node temp=head;
        int x=0;
        while(temp!=null){
            x+=1;
            temp=temp.next;
        }
        Node temp2=head;
        int y=0;
        while(y!=x/2){
            temp2=temp2.next;
            y+=1;
        }
        newNode.next=temp2.next;
    }
    void deleteb(){
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        head=temp.next;
        temp=null;

    }
    void deletel(){
        if(head.next==null){
            head=null;
            return;
        }
       Node temp=head;
       while(temp.next.next!=null){
        temp=temp.next;
       }
       temp.next=null;
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
        list.insert(56);
        list.insert(321);
        list.deleteb();
        list.display();
    }
}
