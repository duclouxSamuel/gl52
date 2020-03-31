package tp01;

public abstract class AbstractStack implements Stack {
	
	@Override
	public boolean isEmpty() {
		return false;
	}
	
	abstract void fireDataAdded();
	
	abstract void fireDataRemoved();

}
