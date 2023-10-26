//lab5 test file
public class Lab5 {
	public static void main(String[] args) {
		// BST object construction
		MyBinarySearchTree bst = new MyBinarySearchTree();
		bst.add(2);
		bst.add(1);
		bst.add(3);
		// Tree Iterator object construction
		myTreeIterator treeIt = new myTreeIterator(bst);
		// Tree Iterator testing object construction
		TreeIteratorTesting testTreeIt = new TreeIteratorTesting(bst, treeIt);

		System.out.println(testTreeIt.treeArray);

	}
}
