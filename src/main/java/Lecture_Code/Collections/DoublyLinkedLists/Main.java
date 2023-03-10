package Lecture_Code.Collections.DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addToRear(12);
        list.addToRear(2);
        list.addToRear(3);
        list.addToRear(4);
        list.addToFront(5);
        list.addToFront(6);

        list.removeFromRear();
        list.removeFromFront();

        for (Integer i: list) {
            System.out.println(i);
        }

        System.out.println("First element: ".concat(Integer.toString(list.get(0))));
        System.out.println("Third element: ".concat(Integer.toString(list.get(2))));
        System.out.println("List size: ".concat(Integer.toString(list.count())));
    }
}
