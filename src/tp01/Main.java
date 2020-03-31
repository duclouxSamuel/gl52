package tp01;

public class Main {

	public static void main(String[] args) {
		// Main method used to demonstrate the algorithms


		//We create a stack from a random number of random integers
		int n = (int) (Math.random()*10);
		System.out.println("Size of the stack is "+ n);
		
		ArrayStack<Integer> newStack = new ArrayStack<>();
		
		
		System.out.println("Original Stack :");
		for(int i = 0; i < n ; i++) {
			int newInt = (int) (Math.random()*10);
			newStack.push(newInt);
			System.out.println(newInt);
			
		}
		
		
		
		int popped = 0;
		System.out.println("Popped stack :");
		for(int i = 0 ; i < n ; i++) {
			
			popped = newStack.pop();
			System.out.println(popped);
		}
		
		AscendentOrderSorter sorter = new AscendentOrderSorter();
		
		
		
	}
}