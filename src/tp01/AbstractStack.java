package tp01;

import java.util.Iterator;

public abstract class AbstractStack <T> implements Stack<T> {
	
	@Override
	public boolean isEmpty() {
		return false;
	}
	
	@Override
	public void addStackListener(StackListener listener) {
		// TODO Auto-generated method stub
		
		//listener.dataAdded(this);
	}

	@Override
	public void removeStackListener(StackListener listener) {
		// TODO Auto-generated method stub
		
		//listener.dataRemoved(this);
	}
	
	public class StackIterator<X> implements Iterator<Object>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public X next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	
	protected abstract void fireDataAdded();
	
	protected abstract void fireDataRemoved();

}
