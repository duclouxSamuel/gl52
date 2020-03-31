package tp01;

public interface Stack extends Iterable<T> {
	
	void push(T data);
	T pop();
	boolean isEmpty();
	int size();
	void addStacklistener(StackListener listener);
	void removeStackListener(StackListener listener);
	
}
