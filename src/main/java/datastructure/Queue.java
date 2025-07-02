//https://www.geeksforgeeks.org/queue-using-stacks/
package datastructure;

import java.util.Stack;

public class Queue {

	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {

		Queue q = new Queue();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.println(q.dequeue(1));
		System.out.println(q.dequeue(2));
		System.out.println(q.dequeue(3));
		System.out.println(q.dequeue(3));

	}

	private static void enqueue(int x) {

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());

		}

		stack1.push(x);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	private static int dequeue(int x) {

		if (stack1.isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			return stack1.pop();
		}
		return -1;
	}

}
