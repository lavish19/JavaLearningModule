//java program to demonstrate a binary tree
 class Node {
	int key;
	Node left,right;
	public Node(int item) {
		key=item;
		left=right=null;
	}

}
class Tree{
	Node root;
	Tree(int key){
		root=new Node(key);
	}
	Tree(){
		root=null;
	}
	public static void main(String[] args) {
		Tree t=new Tree();
		t.root=new Node(1);
		t.root.left=new Node(2);
		t.root.right=new Node(3);
		t.root.left.left=new Node(6);
		t.root.right.right=new Node(9);
	}
	
}
