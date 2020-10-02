package location2Darray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimesionArrayTest {
    public static void main(String[] args) {
        double[][] array = inputValueArray();
        displayArray(array);
        Location location = Location.locateLargest(array);
        System.out.println(location.toString());
    }

    private static double[][] inputValueArray() {
        int row = 0, column = 0;
        double[][] array;
        Scanner input = new Scanner(System.in);
        System.out.println("input size of row: ");
        row = input.nextInt();
        System.out.println("input size of column: ");
        column = input.nextInt();
        array = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("input value of array[%d][%d] : ", i + 1, j + 1);
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    private static void displayArray(double[][] array) {
        System.out.println();
        Arrays.stream(array).forEach(arr -> {
            Arrays.stream(arr).forEach(value -> {
                System.out.print(value + "    ");
            });
            System.out.println();
        });
        System.out.println();
    }
}
