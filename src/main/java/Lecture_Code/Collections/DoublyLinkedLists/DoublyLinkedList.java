package Lecture_Code.Collections.DoublyLinkedLists;

import java.util.Iterator;

public class DoublyLinkedList<Item> implements Iterable<Item> {
    private Node2<Item> head;
    private Node2<Item> tail;
    private int size = 0;

    /* Add a new node to the front of the doubly linked list */
    public void addToFront(Item item) {
        Node2<Item> newNode = new Node2<>();
        newNode.data = item;
        newNode.prev = null;
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    /* Remove a node from the front of the doubly linked list */
    public void removeFromFront() {
        if (head == null){
            throw new IndexOutOfBoundsException("The linked list is empty.");
        }
        this.head = this.head.next;
        this.size--;
        // I presume that Java's garbage collection will take care of the removed Node
    }

    /* Add a new node to the end of the doubly linked list */
    public void addToRear(Item item) {
        Node2<Item> newNode = new Node2<>();
        newNode.data = item;

        if (this.head == null) head = newNode;
        else {
            Node2<Item> currentNode = this.head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            newNode.prev = currentNode;
            currentNode.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    /* Remove a node at the end of the doubly linked list */
    public void removeFromRear() {
        if (this.head == null){
            throw new IndexOutOfBoundsException("The linked list is empty.");
        } else if (this.size == 1) this.head = null;
        else {
            Node2<Item> currentNode = this.head;
            while (currentNode.next.next != null){
                currentNode = currentNode.next;
            }
            this.tail = currentNode;
            currentNode.next.prev = null;
            currentNode.next = null;
        }
        this.size--;
    }

    /* Get a linked list node by index (0-indexed) */
    public Item get(int index) {
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("Invalid linked list node");
        }

        Node2<Item> current = head;
        int i = 0;

        while (i < index){
            current = current.next;
            i++;
        }
        return current.data;
    }


    /* Return the current size of the doubly linked list */
    public int count() {
        return this.size;
    }

    /* Return an Iterator Object */
    @Override
    public Iterator<Item> iterator() {
        //your code
        return new DoublyLinkedListIterator();
    }

    /* Define the Iterator class, and hasNext() and next() methods */
    private class DoublyLinkedListIterator implements Iterator<Item> {
        Node2<Item> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.data;
            current = current.next;
            return item;
        }
    }

    /* Get head node (for test purposes) */
    public Node2<Item> getHead() {
        return head;
    }

    /* Get tail node (for test purposes) */
    public Node2<Item> getTail() {
        return tail;
    }
}