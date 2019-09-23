
public class QueueAppl {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.display();
	}
}
