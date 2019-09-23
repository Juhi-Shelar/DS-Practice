
public class StackAppl {
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		
		stk.display();
		
		stk.pop();
		stk.pop();
		stk.pop();

		stk.display();
	}
}
