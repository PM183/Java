/*Design a Custom Stack using ArrayList class, which implements following functionalities of stack. My Stack
-list ArrayList<Object>: A list to store elements.
+isEmpty: boolean: Returns true if this stack is empty.
+getSize(): int: Returns number of elements in this stack.
+peek(): Object: Returns top element in this stack without
removing it.
+pop(): Object: Returns and Removes the top elements in
this stack.
+push(o: object): Adds new element to the top of this
stack. */

import java.util.ArrayList;

public class p38 {
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Size: " + stack.getSize());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.getSize());
        System.out.println("IsEmpty: " + stack.isEmpty());
    }
}
