import java.util.Deque;

public class Deques { 
    // simplify file given some filesystem movement return the result after doing
    // this commands
    public String simplifyPaths(String s) {
        Deque<String> stack = new java.util.LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (String dir : s.split("/")) {
            if (dir.equals("..") && !stack.isEmpty())
                stack.poll();
            else if (!dir.equals("") && !dir.equals("."))
                stack.push(dir);
        }
        while (stack.size() != 0)
            sb.append("/").append(stack.pollLast());
        return stack.isEmpty() ? "/" : sb.toString();
    }
}
