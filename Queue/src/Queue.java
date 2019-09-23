import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> queue;
	int front, rear;
	
	Queue(){
		queue = new ArrayList<Integer>();
		front = -1;
		rear = -1;
	}
	
	void enqueue(int item) {
		if(front==-1) {
			front++;
		}
		rear++;
		queue.add(rear,item);		
	}
	
	void dequeue() {
		if(front==-1)
			System.out.println("Queue is empty.");

		if(front==rear) {
			front=rear=-1;
		}
		else	
			front++;
	}
	
	void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++)
			System.out.println(queue.get(i));
	}

}
