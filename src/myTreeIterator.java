/**
 * myTreeIterator - 
 * @author Nathaniel Serrano
 * @version 25 October 2023
 *
 */
public class myTreeIterator implements ITreeIterator{
	
	private int sequenceArray[];
	private int nextIndex;
	
	public myTreeIterator(BinarySearchTree bst) {
		sequenceArray = new int[bst.size];
		nextIndex = 0;
		SequenceArray(bst);
		nextIndex = 0;
	}

	
	public int[] SequenceArray(BinarySearchTree bst) {
		return buildSequence(bst.root);
	}
	
	private int[] buildSequence(Node node) {
		if (node==null)
			return sequenceArray;
		buildSequence(node.left);
		sequenceArray[nextIndex++] = node;
		buildSequence(node.right);
		
	}
	
	
	
}

