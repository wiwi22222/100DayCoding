
package wiwiLestiani;

import java.util.Stack;

public class day32 {
    public static void main(String[] args) {
        Stack<Double> myStack = new Stack<>();
        myStack.push(2.14);
        myStack.push(26.0);
        myStack.push(71.6);
        double value = myStack.peek();
        System.out.println("PEEK:"+value);
        System.out.println(myStack);
    }
}
    


