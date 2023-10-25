public abstract class BinarySearchTree<Integer> {

	class Node {

		public Node() {
			root = null;
		}

		int size;
		Node root;

	}

	public abstract boolean add(int data);

	public int getSize() {
		return size;
	}

}
