
/**
 * myTreeIterator - A Class that implements ITreeIterator
 * 
 * @author Nathaniel Serrano
 * @version 25 October 2023
 *
 */
public class myTreeIterator implements ITreeIterator {

	private int sequenceArray[];
	private int nextIndex;

	/**
	 * myTreeIterator()-- Constructor --Takes in a BinarySearchTree
	 * 
	 * @param bst - A Binary Search Tree.
	 */
	public myTreeIterator(MyBinarySearchTree bst) {
		sequenceArray = new int[bst.size];
		nextIndex = 0;
		SequenceArray(bst);
		nextIndex = 0;
	}

	/**
	 * SequenceArray() - Returns all values of the tree left to right in an array.
	 * 
	 * @param bst - A Binary Search Tree
	 */
	public int[] SequenceArray(BinarySearchTree<Integer> bst) {
		sequenceArray = new int[bst.size];
		nextIndex = 0;
		buildSequence(bst.root);
		return sequenceArray;
	}

	/**
	 * buildSequence() - Helper method of Sequence Array
	 * 
	 * @param node - Current local root
	 */
	private void buildSequence(BinarySearchTree<Integer>.Node node) {
		if (node == null)
			return;
		buildSequence(node.left);
		sequenceArray[nextIndex++] = node.data;
		buildSequence(node.right);

	}

}
