package com.coforge.Day_06_07_26_prj;

import java.util.*;

public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // PUSH elements
        for (int i = 1; i <= 10; i++) {
            stack.push((int) (Math.random() * 100));
        }

        System.out.println("Stack after push: " + stack);

        // PEEK (top element)
        System.out.println("Top element (peek): " + stack.peek());

        // POP (remove top element)
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // SEARCH (returns position from top, 1-based index)
        int valueToSearch = stack.get(3); // just example value from stack
        System.out.println("Searching value: " + valueToSearch);
        System.out.println("Position from top: " + stack.search(valueToSearch));

        // EMPTY CHECK
        System.out.println("Is stack empty? " + stack.isEmpty());

        // SIZE
        System.out.println("Stack size: " + stack.size());

        // ITERATE (LIFO order)
        System.out.println("Iterating stack:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();

        // CLEAR STACK (optional)
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
