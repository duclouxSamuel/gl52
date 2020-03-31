package tp01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n = (int) (Math.random()*10);
		System.out.println("Size of array is "+ n);
		
		ArrayStack<Integer> newStack = new ArrayStack<>();
		
		for(int i = 0; i < n ; i++) {
			int newInt = (int) (Math.random()*10);
			newStack.push(newInt);
			System.out.println(newInt);
			
		}
		
		int popped = 0;
		
		for(int i = 0 ; i < n ; i++) {
			
			popped = newStack.pop();
			System.out.println(popped);
		}
	}
}