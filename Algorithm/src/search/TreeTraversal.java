package search;

public class TreeTraversal {
	public static void main(String[] args) {
		Node root = new Node("Ralph");

		Node n1 = new Node("Carmen");
		Node n2 = new Node("Isabelle");
		Node n3 = new Node("Devia");
		n3.setLeftNode(n1).setRightNode(n2);

		Node n4 = new Node("Tom");
		Node n5 = new Node("Wally");
		Node n6 = new Node("Ursula");
		n6.setLeftNode(n4).setRightNode(n5);

		root.setLeftNode(n3).setRightNode(n6);

		TreeTraversal tree = new TreeTraversal();
		System.out.println("Preorder traversal");
		tree.preOrderTraversal(root);
		System.out.println("\n\nInorder traversal");
		tree.inOrderTraversal(root);
		System.out.println("\n\npostorder traversal");
		tree.postOrderTraversal(root);
	}

	private void preOrderTraversal(Node node) {
		if (node != null) {
			System.out.print(node.mKey);
			if (node.mLeftNode != null) {
				System.out.print(" - ");
				preOrderTraversal(node.mLeftNode);
			}
			if (node.mRightNode != null) {
				System.out.print(" - ");
				preOrderTraversal(node.mRightNode);
			}
		}
	}

	private void inOrderTraversal(Node node) {
		if (node != null) {
			if (node.mLeftNode != null) {
				inOrderTraversal(node.mLeftNode);
				System.out.print(" - ");
			}

			System.out.print(node.mKey);

			if (node.mRightNode != null) {
				System.out.print(" - ");
				inOrderTraversal(node.mRightNode);
			}
		}
	}

	private void postOrderTraversal(Node node) {
		if (node != null) {
			if (node.mLeftNode != null) {
				postOrderTraversal(node.mLeftNode);
				System.out.print(" - ");
			}
			if (node.mRightNode != null) {
				postOrderTraversal(node.mRightNode);
				System.out.print(" - ");
			}
			System.out.print(node.mKey);
		}
	}
}

class Node {
	String mKey;
	Node mLeftNode;
	Node mRightNode;

	public Node(String key) {
		mKey = key;
	}

	public Node setLeftNode(Node node) {
		mLeftNode = node;
		return this;
	}

	public Node setRightNode(Node node) {
		mRightNode = node;
		return this;
	}
}
