package tp01;

import java.util.Iterator;

public class ArrayStack extends AbstractStack {
	
	private T[] content;

	/*Method used to push data into the stack
	 * 
	 */
	@Override
	public void push(T data) {
		
		//We create a new stack of size n+1
		int n = this.size();
		T[] newDataStack = new T[n +1];
		
		//We copy the actual stack into the new one
		for( int i = 0 ; i < n ; i++)
			newDataStack[i] = this.content[i];
		
		//We add the new data into the new stack
		newDataStack[n] = data;
		
		this.content = newDataStack;
	}

	@Override
	public T pop(){
		
		int n = this.size();
		
		//We locally save the poppedData
		T poppedData = this.content[n-1];
		
		//We create a new stack of size n-1
		T[] newDataStack = new T[n-1];
		
		//We copy the actual stack into the new one
		for(int i = 0 ; i < n-1 ; i++)
			newDataStack[i] = this.content[i];
		
		return poppedData;
	}

	@Override
	public int size() {
		return this.content.length;
	}

	
	@Override
	public void addStacklistener(StackListener listener) {
		// TODO Auto-generated method stub
		
		listener.dataAdded(this);
	}

	@Override
	public void removeStackListener(StackListener listener) {
		// TODO Auto-generated method stub
		
		listener.dataRemoved(this);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void fireDataAdded() {
		// TODO Auto-generated method stub
	}

	@Override
	void fireDataRemoved() {
		// TODO Auto-generated method stub
		
	}

}
