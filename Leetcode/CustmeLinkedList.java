package javaforgood;

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class CustmeLinkedList {
	private Node head;

	boolean hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null & fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true; // cycle detected

		}
		return false;
	}

	public int middle() {
		Node slow = head;
		Node fast = head;
		while (fast != null & fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow.data;
	}

	Node findnth(int n) {
		Node first = head, second = head;
		for (int i = 0; i < n; i++) {
			if(first==null)
				return null;
			first = first.next;
		}
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		return second;
	}

	public void reverse() {

		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next; // store next
			current.next = prev; // reverse pointer
			prev = current; // move prev ahead
			current = next; // move current ahead
		}
		head = prev;
	}

	public void add(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newnode;

	}

	public void delete(int value) {
		Node current = head;
		if (current.data == value) {
			head = head.next;
			return;
		}
		while (current.next != null && current.next.data != value) {
			current = current.next;
		}
		if (current.next != null) {
			current.next = current.next.next;
		}

	}

	void printlist() {

		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CustmeLinkedList g = new CustmeLinkedList();
		g.add(0);
		g.add(10);
		g.add(67);
		g.add(1110);
		g.add(10);
		g.add(110);
		g.add(90);
		g.add(1000);
		g.printlist();
		g.delete(110);
		g.printlist();

		g.delete(63);
		g.printlist();
		g.reverse();
		g.printlist();
		int j = g.middle();
		System.out.println(j + "====");
		Node yutub = g.findnth(7);
		g.printlist();

		System.out.println(yutub.data);
	}

}
