package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxInteger {
    public static int[] readNumbers(String path) throws FileNotFoundException {
        int[] numbers = new int[100];
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int i = 0;

        while (scanner.hasNextLine()){
            numbers[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        scanner.close();
        return numbers;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void writeToFile(String path, int maxNumber) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        fw.write(Integer.toString(maxNumber));
        fw.close();
    }
}
