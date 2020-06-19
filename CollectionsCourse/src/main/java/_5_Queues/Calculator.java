package _5_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

public class Calculator {

    public int evaluate(final String input) {
        //create our deque
        final Deque<String> stack = new ArrayDeque<>();
        //split input into tokens
        final String[] tokens = input.split(" ");
        //fill stack with tokens from array
        for (String token : tokens) {
            stack.add(token);
        }
//loop around and reduce the stack inside with pop()
        while (stack.size() > 1) {
            //1
            final int left = parseInt(stack.pop()); //pop removes an element
            //+
            final String operator = stack.pop();
            //3
            int right = parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
            }
//put result value back to stack
            stack.push(String.valueOf(result));
        }
//one element in stack is left. We take it and convert to Integer
        return parseInt(stack.pop());
    }
}
