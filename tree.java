class Tree{
    int data;
    Tree left,right;
    Tree(int data){
        this.data=data;
        left=right=null;
    }
}
public class tree {
    public static void sum(Tree root){
        int sum=root.data;
        if (root==null){
            return;
        }
        sum=sum+root.left.data ;


    }
    public static void main(String[] args) {
        Tree root=new Tree(2);
        root.left =new Tree(3);
        root.right=new Tree(4);
        root.left.left=new Tree(5);
        root.left.right=new Tree(6);
    }
}
