import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int rows;
        int columns;
        double array[][];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows:");
        rows = scanner.nextInt();
        System.out.println("Enter columns:");
        columns = scanner.nextInt();
        array = new double[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.println("Enter value of elements " + "row " + (row + 1) + " column " + (column + 1));
                array[row][column] = scanner.nextDouble();
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        double max = array[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Max value is "+max + " at row " + (index1 + 1) + " column " + (index2 +1));
    }
}
