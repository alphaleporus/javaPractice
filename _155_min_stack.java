import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _155_min_stack {
    public Deque<List<Integer>> stack = new ArrayDeque<>();
    public _155_min_stack() {
        
    }
    
    public void push(int value) {
        int currentMin = 0;
        if(stack.isEmpty())currentMin=value;
        else{
            List<Integer> first = stack.peekFirst();
            currentMin = first.get(1);
        }
        currentMin = Math.min(value, currentMin);
        List<Integer> node = new ArrayList<>();
        node.add(0, value);
        node.add(1, currentMin);
        stack.push(node);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty())return 0;
        else{
            List<Integer> first = stack.peek();
            return first.get(0);
        }
    }
    
    public int getMin() {
        if(stack.isEmpty())return 0;
        else{
            List<Integer> first = stack.peekFirst();
            return first.get(1);
        }
    }
}
