public abstract class BinarySearchTree<Integer> {
	int size;
	Node root;
	class Node {

		public Node(int data) {
			right = null;
			left = null;
			this.data = data;
		}

		Node right;
		Node left;
		int data;
		
		
	}

	public abstract boolean add(int data);

	public int getSize() {
		return size;
	}

}
