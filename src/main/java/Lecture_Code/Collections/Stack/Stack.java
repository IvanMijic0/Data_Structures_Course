package Lecture_Code.Collections.Stack;

import Lecture_Code.Collections.SingleLinkedLists.Node;

/**
 * Stack implementation (using linked lists).

 * Implement the missing method code.
 * Feel free to delete "return null", etc. lines; they're just placeholders.
 *
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class Stack<Item> {
    private Node<Item> top = null;
    private int size = 0;


    /* Push an item onto the stack */
    public void push(Item item) {
        Node<Item> newNode = new Node<>();
        newNode.data = item;
        newNode.next = this.top;
        this.top = newNode;
        this.size++;
    }

    /* Check if the stack is empty */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /* Remove the top item from the stack, and return its data */
    public Item pop() {
        if (this.top == null) throw new IndexOutOfBoundsException("The stack is empty.");
        Item dataToBeReturned = this.top.data;
        this.top = this.top.next;
        this.size--;
        return dataToBeReturned;
    }

    public Item get(int index) {
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("Invalid linked list node");
        }

        Node<Item> current = this.top;
        int i = 0;

        while (i < index){
            current = current.next;
            i++;
        }
        return current.data;
    }


    /* Return the current size of the stack */
    public int size() {
        return this.size;
    }
}