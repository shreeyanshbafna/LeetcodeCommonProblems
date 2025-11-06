package Leetcode;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;

	}

}

class Bst {
	Node root;

	int height(Node root) {
		if (root == null)
			return -1; // if you want edges count
		// if you want nodes count instead, use return 0
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}

	Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (root != null) {
			if (root.data > data) {
				root.left = insert(root.left, data);

			} else if (root.data < data) {
				root.right = insert(root.left, data);

			}
		}
		return root;
	}

}

public class BST1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst tree = new Bst();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(4);
		tree.root.left.right.right = new Node(7);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);
		System.out.println(tree);

	}

}
