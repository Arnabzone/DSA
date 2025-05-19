package DSA;

import java.util.*;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop operation
    public int pop() { 
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("No elements in stack.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = 0; i <= top; i++) { 
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(2);
        s.push(9);
        s.push(20);
        s.display(); // Output: 2 9 20

        s.pop();     // Removes 20
        s.display(); // Output: 2 9
    }
}
