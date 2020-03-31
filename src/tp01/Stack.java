package tp01;

public interface Stack<T> extends Iterable<T> {
	
	void push(T data);
	T pop();
	boolean isEmpty();
	int size();
	
	void addStackListener(StackListener listener);
	void removeStackListener(StackListener listener);
	
}
