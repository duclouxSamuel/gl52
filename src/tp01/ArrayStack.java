package tp01;

import java.util.Iterator;

public class ArrayStack<T> extends AbstractStack<T> {
	
	private T[] content;
	
	
	
	/*Method used to push data into the stack
	 */
	@Override
	public void push(T data) {
		
		//We create a new stack of size n+1
		int n = this.size();
		T[] newDataStack = (T[]) new Object[n+1];
		
		//We copy the actual stack into the new one
		for( int i = 0 ; i < n ; i++)
			newDataStack[i] = this.content[i];
		
		//We add the new data into the new stack
		newDataStack[n] = data;
		
		
		this.addStackListener(null);
		this.content = newDataStack;
	}

	/*
	 * Method used to pop data from the stack
	 */
	@Override
	public T pop(){
		
		int n = this.size();
		
		//We locally save the poppedData
		T poppedData = this.content[n-1];
		
		//We create a new stack of size n-1
		T[] newDataStack = (T[]) new Object[n-1];

		//We copy the actual stack into the new one
		for(int i = 0 ; i < n-1 ; i++)
			newDataStack[i] = this.content[i];
		
		StackListener listener = null ;
		this.removeStackListener(listener);
		
		this.content = newDataStack;
		
		return poppedData;
	}

	/*
	 * Returns the size of the stack
	 */
	@Override
	public int size() {
		if (this.content != null)
		return this.content.length;
		
		return 0;
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected
	void fireDataAdded() {
		// TODO Auto-generated method stub
	}

	@Override
	protected
	void fireDataRemoved() {
		// TODO Auto-generated method stub
	}
	
}
