/**
 * This is a my Binary Search Tree class that implements BinarySearchTree class
 * which has a recursive add method.
 * 
 * @author Vivek Reddy Bhimavarapu
 */

public class MyBinarySearchTree extends BinarySearchTree<Integer> {

	/**
	 * Adds an element to the binary search tree.
	 *
	 * @param data The integer value to be added to the tree.
	 * @return true if the element is successfully added.
	 */
	@Override
	public boolean add(int data) {
		root = insertRecursive(root, data);
		size++;
		return true;

	}

	private Node insertRecursive(Node current, int data) {
		if (current == null) {
			return new Node(data);
		}

		if (data < current.data) {
			current.left = insertRecursive(current.left, data);
		} else if (data > current.data) {
			current.right = insertRecursive(current.right, data);
		}

		return current;
	}
}
