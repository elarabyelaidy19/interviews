package Gem.Stack;

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
        }
        return stack.isEmpty();

        
    } 

    // ===================================================================== 

    public boolean backSpaceCompare(String s, String t) { 
        return build(s).equals(build(t));
    }

    public String build(String s) { 
        Stack<Character> stack = new Stack<>(); 
        for(char c : s.toCharArray()) { 
            if(c != '#') 
                stack.push(c); 
            else if (!stack.isEmpty()) 
                stack.pop();
        }
        return String.valueOf(stack);
    } 



    // ================================================================================== 
    // evaluate reverse polish notations
    public int evalRPN(String[] tokens) {
        int a;
        int b;
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(a + b);
            } else if (c.equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b - a);
            } else if (c.equals("/")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b / a);
            } else if (c.equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(a * b);
            } else {
                stack.add(Integer.parseInt(c));
            }
        }
        return stack.pop();
    } 


    // ======================================================================================= 
    // min stack 
    class MinStack {
        private Node head;

        public void push(int x) {
            if (head == null)
                head = new Node(x, x, null);
            else
                head = new Node(x, Math.min(head.min, x), head);
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

        private class Node {
            int val;
            int min;
            Node next;

            private Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }
}
