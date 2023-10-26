//joseph Rumery 
public class TreeIteratorTesting {

	int[] treeArray;

	public TreeIteratorTesting(BinarySearchTree<Integer> bst, ITreeIterator treeIter) {

		bst.add(3);
		bst.add(0);
		bst.add(6);
		bst.add(1);

		int[] treeArray = new int[bst.getSize()];

		treeArray = treeIter.SequenceArray(bst);

	}

	public boolean checkOrder() {

		MyBinarySearchTree testbst = new MyBinarySearchTree();

		myTreeIterator testIt = new myTreeIterator(testbst);

		testbst.add(0);
		testbst.add(1);
		testbst.add(3);
		testbst.add(6);

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
