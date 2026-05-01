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
    void insertatplace(int position,int data){
        Node newNode=new Node(data);
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
     void deleteplace(int position){
        if (position==0){
            Node temp=head;
            head=temp.next;
            temp=null;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        temp.next=temp.next.next;
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
        list.insertatplace(3, 21);
        list.deleteplace(2);
        // list.deleteb();
        list.display();
    }
}
