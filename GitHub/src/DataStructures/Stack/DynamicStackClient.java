package DataStructures.Stack;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {

		DynamicStack ds = new DynamicStack();
		ds.push(100);
		ds.push(200);
		ds.push(300);
		ds.push(400);
		ds.push(500);
		ds.push(600);
		ds.push(700);
		ds.push(800);
		ds.push(900);
		ds.push(1000);

		ds.display();

	}
}
