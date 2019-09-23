import java.util.ArrayList;

public class Stack {
	ArrayList<Integer> stck;
	int top;
	
	Stack(){
		stck = new ArrayList<Integer>();
		top = -1;
	}
	
	void push(int item) {
		stck.add(item);
		top++;
	}
	
	int pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}			
		int item = stck.get(top);
		stck.remove(top);
		top--;
		
		return item;
	}
	
	void display() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i=0;i<=top;i++)
			System.out.println(stck.get(i));
	}
}


