package org.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C://Users//User//IdeaProjects//DS_firstLab//TextFiles//numbers.txt";
        System.out.println("Reading numbers...");

        int[] numbers = MaxInteger.readNumbers(path);
        int maxNumber = MaxInteger.findMax(numbers);

        System.out.println("Maximum number is: ".concat(Integer.toString(maxNumber)));
        System.out.println("Writing to file...");

        MaxInteger.writeToFile(path, maxNumber);
    }
}