/**
 * BinarySearchTree class used by myBinarySearchTree for implementation of a
 * BinarySearchTree object
 * 
 * @author Jonah
 * @param <Integer>
 */
public abstract class BinarySearchTree<Integer> {
	int size;
	Node root;

	/**
	 * Node class which sets the initial children, data and variables
	 */
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

	/**
	 * Skeleton add method for myBinarySearchTree
	 * 
	 * @param data item to add
	 * @return boolean true or false on successful add
	 */
	public abstract boolean add(int data);

	/**
	 * getSize for size int
	 * 
	 * @return size of tree
	 */
	public int getSize() {
		return size;
	}

}
