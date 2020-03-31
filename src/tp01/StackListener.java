package tp01;

import java.util.EventListener;

public interface StackListener extends EventListener {
	
	void dataAdded(Stack<?> stack);
	void dataRemoved(Stack<?> stack);

}