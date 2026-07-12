import java.util.ArrayDeque;
import java.util.Deque;

public class _150_evalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s:tokens){
            switch(s){
                case "+":{
                    stack.push(stack.pop() + stack.pop());
                    break;
                }
                case "-":{
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                }
                case "*":{
                    stack.push(stack.pop()*stack.pop());
                    break;
                }
                case "/":{
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a/b);
                    break;
                }
                default:{
                int n = Integer.parseInt(s);
                stack.push(n);
                }
            }
        }
        return stack.pop();
    }
}