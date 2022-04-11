package Gem.Stacks;

import java.util.Stack;

public class Stacks { 

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int res = 0;
        for (int sc : stack)
            res += sc;
        return res;

    } 

    // ================================================================================== 
    // valid parentheses must be complete ()[]{} -> true , [](){] -> false

    public boolean isValid(String s) { 
        Stack<Character> stack = new Stack<>();
        if(s == null) return false; 
        if(s.length() == 0) return true;
        for(char c : s.toCharArray()) { 
            if(c == '(' || c == '[' || c == '{') { 
                stack.push(c);

            } else if(c == ')') { 
                if(stack.isEmpty() || stack.pop() != '(') 
                    return false;
            } else if (c == ']') {  
                if (stack.isEmpty() || stack.pop() != '[') 
                    return false; 
            } else { 
                if (stack.isEmpty() || stack.pop() != '{') 
                    return false;
            }   
        }return stack.isEmpty();

        }
    }
}
