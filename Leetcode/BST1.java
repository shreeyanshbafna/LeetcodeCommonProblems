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
				root.right = insert(root.right, data);

			}
		}
		return root;
	}

	Node delete(Node root, int data) {
		if (root == null)
			return null;
		if (data < root.data) {
		    root.left = delete(root.left, data);
		} else if (data > root.data) {
		    root.right = delete(root.right, data);
		} else {
			 if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			Node minNode = findMinNode(root.right);
			root.data = minNode.data;
			root.right = delete(root.right, minNode.data);

		}
		return root;
	}

	Node findMinNode(Node root) {
		while (root.left != null) {
			root = root.left;

		}
		;
		return root;
	}

	boolean search(Node root, int data) {
		if (root == null)
			return false;
		else if (root.data == data) {
			return true;

		} else {
			if (root.data > data) {
				return search(root.left, data);

			} else if (root.data < data) {
				return search(root.right, data);

			}
		}
		return false;
	}

	// left to root to right
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// root ->left -> right
	void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);

		}
	}

	// left -> right -> root
	void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

    // ✅ Print Tree in readable way
    void printTree(Node root, String prefix, boolean isLeft) {
        if (root == null) return;

        if (root.right != null)
            printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);

        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + root.data);

        if (root.left != null)
            printTree(root.left, prefix + (isLeft ? "    " : "│   "), true);
    }

    void print() {
        printTree(root, "", true);
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
		System.out.println("Height of tree: " + tree.height(tree.root));

		System.out.println("Search 6: " + tree.search(tree.root, 6));
		System.out.println("Search 9: " + tree.search(tree.root, 9));
		System.out.println();
		tree.preorder(tree.root);
		System.out.println();
		tree.print();
		System.out.println();
		tree.delete(tree.root, 10);
		System.out.println();
		tree.preorder(tree.root);
		System.out.println();
tree.print();
	}

}
