package DataStructures.Queue;

public class Queue {

	protected int[] data;
	protected int front;
	protected int size = 0;

	public Queue() {

		this.data = new int[5];
		front = size = 0;

	}

	public Queue(int cap) {

		this.data = new int[cap];
		front = size = 0;

	}

	public void enqueue(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Empty");
		}

		int idx = (front + size) % data.length;
		data[idx] = item;
		size = size + 1;

	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size = size - 1;
		return temp;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return data[front];
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public boolean isFull() {

		return size == data.length;
	}

	public void display() {

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[(i + front) % data.length] + " ");
		}

	}

}
