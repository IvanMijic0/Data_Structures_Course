package Lecture_Code.Collections.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("red");
        myStack.push("blue");
        myStack.push("yellow");
        myStack.push("green");

        System.out.println("Pushed stack elements: ");
        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.get(i));
        }
        System.out.println("Stack size before pop: ".concat(Integer.toString(myStack.size())));
        System.out.println("\nPopped first two elements.");

        myStack.pop();
        myStack.pop();

        System.out.println("\nElements after pop: ");
        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.get(i));
        }
        System.out.println("Stack size after pop: ".concat(Integer.toString(myStack.size())));


    }
}
