package DataStructures.Queue;

public class QueueClient {

	public static void main(String[] args) throws Exception {

		Queue q = new Queue();

		q.enqueue(100);
		q.enqueue(200);
		q.enqueue(300);
		q.enqueue(400);
		q.enqueue(500);

		q.display();

	}

}
