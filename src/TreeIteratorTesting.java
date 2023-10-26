
//joseph Rumery 

public class TreeIteratorTesting {

	int[] treeArray;
	
	public TreeIteratorTesting(MyBinarySearchTree bst, myTreeIterator treeIter) {

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

			if (testarray[i] != this.treeArray[i]) {

				return false;

			}

		}

		return true;

	}

}
