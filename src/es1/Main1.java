package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        Random rnd = new Random();

        Scanner input = new Scanner(System.in);

        while (true) {
            int position;
            int num = rnd.nextInt(1, 10);
            System.out.println("Position to insert between 1 and 5: ");
            position = input.nextInt();
            if(position == 0) {
                break;
            }

            try {
                numbers[position - 1] = num;
                System.out.println("Current Array: " + Arrays.toString(numbers));
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println(e.getMessage());
            }
        }

        input.close();
    }
}
