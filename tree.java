class Tree{
    int data;
    Tree left,right;
    Tree(int data){
        this.data=data;
        left=right=null;
    }
}
public class tree {
    public static int sum(Tree root){
        if (root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);


    }
    public static void main(String[] args) {
        Tree root=new Tree(2);
        root.left =new Tree(3);
        root.right=new Tree(4);
        root.left.left=new Tree(5);
        root.left.right=new Tree(6);
        System.out.print("Sum of nodes:"+sum(root));
    }
}
