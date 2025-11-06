package javaforgood;

class StackNode {
	StackNode next;
	int data;

	public StackNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class CustomStack {
	private StackNode top;
	private int size;

	public CustomStack() {
		this.top = null;
		this.size = 0;
	}

	public void push(int data) {

		StackNode newnode = new StackNode(data);

		newnode.next = top;
		top = newnode;
		size++;
	}

	public int pop() {
		if (top == null) {
			throw new RuntimeException("invalid");
		}
		int popped = top.data;
		top = top.next;
		return popped;

	}

	public int peek() {
		if (top == null) {
			throw new RuntimeException("invalid");
		}
		int popped = top.data;

		return popped;

	}

	public int getSize() {
		return size;
	}

	public void print() {
		StackNode currnode = top;
		while (currnode != null) {
			System.out.print(currnode.data + "->");
			currnode = currnode.next;
		}
		System.out.println("null");
	}
}

public class CustomStackWithLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack sta = new CustomStack();
		sta.push(0);
		sta.push(10);
		sta.push(120);

		System.out.println(sta.peek());
		sta.print();
		sta.pop();
		System.out.println(sta.peek());
		sta.print();

	}

}
