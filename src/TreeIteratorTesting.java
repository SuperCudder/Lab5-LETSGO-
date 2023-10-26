//joseph Rumery 
public class TreeIteratorTesting {

	int[] treeArray;
	
	public TreeIteratorTesting(BinarySearchTree<Integer> bst, ITreeIterator treeIter) {

		bst.add(2);
		bst.add(1);
		bst.add(3);

		treeArray = new int[bst.getSize()];

		treeArray = treeIter.SequenceArray(bst);

	}

	public boolean checkOrder() {

		MyBinarySearchTree testbst = new MyBinarySearchTree();

		myTreeIterator testIt = new myTreeIterator(testbst);

		testbst.add(1);
		testbst.add(2);
		testbst.add(3);

		int[] testarray = new int[testbst.getSize()];

		testarray = testIt.SequenceArray(testbst);

		for (int i = 0; i < testarray.length; i++) {

			if (testbst.root.data != this.treeArray[i]) {

				return false;

			}

		}

		return true;

	}

}
