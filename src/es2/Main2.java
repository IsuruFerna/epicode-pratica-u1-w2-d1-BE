package es2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (input) {
            System.out.println("Distance traveled in km: ");
            int distance = input.nextInt();
            System.out.println("Consumption in liters: ");
            int consumption = input.nextInt();
            System.out.println("Consumption per km is " + (distance / consumption) + "l");

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
