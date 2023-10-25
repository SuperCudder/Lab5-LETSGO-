
/**
 * myTreeIterator - 
 * @author Nathaniel Serrano
 * @version 25 October 2023
 *
 */
public class myTreeIterator implements ITreeIterator{
	
	private int sequenceArray[];
	private int nextIndex;
	
	public myTreeIterator(BinarySearchTree<Integer> bst) {
		sequenceArray = new int[bst.size];
		nextIndex = 0;
		SequenceArray(bst);
		nextIndex = 0;
	}

	
	public int[] SequenceArray(BinarySearchTree<Integer> bst) {
		buildSequence(bst.root);
		return sequenceArray;
	}
	
	private void buildSequence(BinarySearchTree.Node node) {
		if (node==null)
			return;
		buildSequence(node.left);
		sequenceArray[nextIndex++] = node.data;
		buildSequence(node.right);
		
	}
	
	
	
}

