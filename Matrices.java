package matrices;

import java.util.Scanner;

public class Matrices {

    public static void displayOption() {
        System.out.println("Matrices in JAVA");
        System.out.println("[1] Addition Matrix");
        System.out.println("[2] Subtraction Matrix");
        System.out.println("[3] Multiplication Matrix");
        System.out.println("[4] Multiplication Scalar");
        System.out.println("[5] Exit");
        System.out.print("Option: ");
    }

    public static int[][] getMatrixInput(Scanner input, int matrixSize, String name) {
        int[][] matrix = new int[matrixSize][matrixSize];

        System.out.println("Enter values for " + name + " matrix: ");

        for (int rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
            for (int colIndex = 0; colIndex < matrixSize; colIndex++) {
                System.out.println("Enter First Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                matrix[rowIndex][colIndex] = input.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] getMatrixInput(Scanner input, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter values for " + name + " matrix: ");

        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                System.out.println("Enter First Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                matrix[rowIndex][colIndex] = input.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] getAdditionMatrixResult(int[][] matrixOne, int[][] matrixTwo, int matrixSize) {
        int[][] matrixResult = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixResult[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        return matrixResult;
    }

    public static int[][] getSubtractionMatrixResult(int[][] matrixOne, int[][] matrixTwo, int matrixSize) {
        int[][] matrixResult = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixResult[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }

        return matrixResult;
    }

    public static int[][] getMultiplicationMatrix(int[][] matrixOne, int[][] matrixTwo, int rowsOne, int colsOne, int colsTwo) {
        int[][] matrixResult = new int[rowsOne][colsTwo];

        for (int i = 0; i < rowsOne; i++) {
            for (int j = 0; j < colsTwo; j++) {
                matrixResult[i][j] = 0;
                for (int k = 0; k < colsOne; k++) {
                    matrixResult[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }

        return matrixResult;
    }

    public static int[][] getMultiplicationScalarMatrix(int[][] matrix, int rows, int cols, int scalar) {
        int[][] matrixResult = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixResult[i][j] = scalar * matrix[i][j];
            }
        }

        return matrixResult;
    }

    public static void displayResult(int[][] matrixResult, int matrixSize) {
        //display
        System.out.println("Result:");
        for (int rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
            for (int colIndex = 0; colIndex < matrixSize; colIndex++) {
                System.out.print(matrixResult[rowIndex][colIndex] + " \t");
            }
            System.out.println();
        }
    }

    public static void displayResult(int[][] matrixResult, int rows, int cols) {
        //display
        System.out.println("Result:");
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                System.out.print(matrixResult[rowIndex][colIndex] + " \t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again;

        do {
            int option;
            int[][] matrixOne;
            int[][] matrixTwo;
            int[][] matrixResult;

            //for matrix row one
            int matrixRowOne;

            //for matrix row two
            int matrixRowTwo;

            //for matrix column one
            int matrixColOne;

            //for matrix column two
            int matrixColTwo;

            //this is for addition and subtraction matrix
            int matrixSize;

            displayOption();
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Addition Matrix");
                    System.out.print("Enter size of Matrix: ");
                    matrixSize = input.nextInt();

                    matrixOne = getMatrixInput(input, matrixSize, "First");
                    matrixTwo = getMatrixInput(input, matrixSize, "Second");

                    matrixResult = getAdditionMatrixResult(matrixOne, matrixTwo, matrixSize);

                    //display the result
                    displayResult(matrixResult, matrixSize);
                    break;
                case 2:
                    System.out.println("Subtraction Matrix");
                    System.out.print("Enter size of Matrix: ");
                    matrixSize = input.nextInt();

                    matrixOne = getMatrixInput(input, matrixSize, "First");
                    matrixTwo = getMatrixInput(input, matrixSize, "Second");

                    matrixResult = getSubtractionMatrixResult(matrixOne, matrixTwo, matrixSize);

                    //display the result
                    displayResult(matrixResult, matrixSize);
                    break;
                case 3:
                    System.out.println("Multiplication Matrix");

                    System.out.print("Number of rows of First Matrix: ");
                    matrixRowOne = input.nextInt();

                    System.out.print("Number of column of First Matrix: ");
                    matrixColOne = input.nextInt();

                    System.out.print("Number of rows of Second Matrix: ");
                    matrixRowTwo = input.nextInt();

                    System.out.print("Number of column of First Matrix: ");
                    matrixColTwo = input.nextInt();

                    if (matrixColOne != matrixRowTwo) {
                        System.out.println("Two sizes are not match.");
                        break;
                    }

                    matrixOne = getMatrixInput(input, matrixRowOne, matrixColOne, "First");
                    matrixTwo = getMatrixInput(input, matrixRowTwo, matrixColTwo, "Second");

                    matrixResult = getMultiplicationMatrix(matrixOne, matrixTwo, matrixRowOne, matrixColOne, matrixColTwo);
                    displayResult(matrixResult, matrixRowOne, matrixColTwo);

                    /*
                    sample
                    A = [1,2,3]     B = [7,8]
                        [4,5,6]         [9,10]
                                        [11,21]
                     */
                    break;
                case 4:
                    System.out.println("Multiplicataion Scalar Matrix");

                    System.out.println("Enter Scalar Number (number to multiply): ");
                    int scalar = input.nextInt();

                    System.out.print("Enter row size of Matrix: ");
                    matrixRowOne = input.nextInt();

                    System.out.print("Enter column size of Matrix: ");
                    matrixColOne = input.nextInt();

                    matrixOne = getMatrixInput(input, matrixRowOne, matrixColOne, "Scalar");

                    matrixResult = getMultiplicationScalarMatrix(matrixOne, matrixRowOne, matrixColOne, scalar);

                    displayResult(matrixResult, matrixRowOne, matrixColOne);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    input.close();
                    break;
                default:
                    System.out.println("Invalid Input Please Try Again.");
                    break;
            }
            System.out.println("Do you want to try again? [Y] \nPress any key to exit : ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'Y' || again == 'y');
        input.close();
    }
}
