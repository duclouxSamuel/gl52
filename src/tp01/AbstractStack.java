package tp01;

import java.util.Iterator;

public abstract class AbstractStack <T> implements Stack<T> {
	
	@Override
	public boolean isEmpty() {
		return false;
	}
	
	@Override
	public void addStackListener(StackListener listener) {
		// This method is a listener for stacks adds
		
		//listener.dataAdded(this);
	}

	@Override
	public void removeStackListener(StackListener listener) {
		// This method is a listener for stack removals
		
		//listener.dataRemoved(this);
	}
	
	public class StackIterator<X> implements Iterator<Object>{

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public X next() {
			return null;
		}
		
	}
	
	
	protected abstract void fireDataAdded();
	
	protected abstract void fireDataRemoved();

}
