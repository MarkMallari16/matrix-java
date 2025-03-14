package matrices;

import java.util.Scanner;

public class Matrices {

    public static void displayOption() {
        System.out.println("Matrices in JAVA");
        System.out.println("[1] Addition Matrix");
        System.out.println("[2] Subtraction Matrix");
        System.out.println("[3] Multiplication Matrix");
        System.out.println("[4] Exit");
        System.out.print("Option: ");
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

    public static int[][] getAdditionMatrixResult(int[][] matrixOne, int[][] matrixTwo, int rows, int cols) {
        int[][] matrixResult = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixResult[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        return matrixResult;
    }

    public static int[][] getSubtractionMatrixResult(int[][] matrixOne, int[][] matrixTwo, int rows, int cols) {
        int[][] matrixResult = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixResult[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }

        return matrixResult;
    }

    public static void displayResult(int[][] matrixResult, int rows, int cols) {
        //display
        System.out.println("Result:");
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                System.out.print(matrixResult[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        displayOption();
        option = input.nextInt();
        input.nextLine();

        switch (option) {
            case 1:
                System.out.println("Addition Matrix");
                System.out.print("Number of rows of First Matrix: ");
                matrixRowOne = input.nextInt();

                System.out.print("Number of column of First Matrix: ");
                matrixColOne = input.nextInt();

                System.out.print("Number of rows of Second Matrix: ");
                matrixRowTwo = input.nextInt();

                System.out.print("Number of column of Second Matrix: ");
                matrixColTwo = input.nextInt();

                if (matrixRowOne != matrixRowTwo || matrixColOne != matrixColTwo) {
                    System.out.println("Two sizes are not match.");
                    break;
                }

                matrixOne = getMatrixInput(input, matrixRowOne, matrixColOne, "First");
                matrixTwo = getMatrixInput(input, matrixRowTwo, matrixColTwo, "Second");

                matrixResult = getAdditionMatrixResult(matrixOne, matrixTwo, matrixRowOne, matrixColOne);

                displayResult(matrixResult, matrixRowOne, matrixColOne);
                break;
            case 2:
                System.out.println("Subtraction Matrix");
                System.out.print("Number of rows of First Matrix: ");
                matrixRowOne = input.nextInt();

                System.out.print("Number of column of First Matrix: ");
                matrixColOne = input.nextInt();

                System.out.print("Number of rows of Second Matrix: ");
                matrixRowTwo = input.nextInt();

                System.out.print("Number of column of Second Matrix: ");
                matrixColTwo = input.nextInt();

                matrixOne = new int[matrixRowOne][matrixColOne];
                matrixTwo = new int[matrixRowTwo][matrixColTwo];
                matrixResult = new int[matrixRowOne][matrixColOne];

                if (matrixOne.length != matrixTwo.length) {
                    System.out.print("Two sizes are not match.");
                    break;
                }

                for (int rowIndex = 0; rowIndex < matrixTwo.length; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixTwo.length; colIndex++) {
                        System.out.print("Enter Second Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                        matrixOne[rowIndex][colIndex] = input.nextInt();
                    }
                }

                for (int rowIndex = 0; rowIndex < matrixTwo.length; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixTwo.length; colIndex++) {
                        System.out.print("Enter Second Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                        matrixTwo[rowIndex][colIndex] = input.nextInt();
                    }
                }

                for (int i = 0; i < matrixOne.length; i++) {
                    for (int j = 0; j < matrixOne.length; j++) {
                        matrixResult[i][j] = 0;
                        matrixResult[i][j] = matrixOne[i][j] - matrixTwo[i][j];
                    }
                }

                System.out.println("Result:");
                for (int rowIndex = 0; rowIndex < matrixOne.length; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixOne.length; colIndex++) {
                        System.out.print(matrixResult[rowIndex][colIndex] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
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
                matrixOne = new int[matrixRowOne][matrixColOne];
                matrixTwo = new int[matrixRowTwo][matrixColTwo];
                matrixResult = new int[matrixRowOne][matrixColTwo];

                for (int rowIndex = 0; rowIndex < matrixRowOne; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColOne; colIndex++) {
                        System.out.println("Enter First Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                        matrixOne[rowIndex][colIndex] = input.nextInt();
                    }
                }
                for (int rowIndex = 0; rowIndex < matrixRowTwo; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColTwo; colIndex++) {
                        System.out.println("Enter Second Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                        matrixTwo[rowIndex][colIndex] = input.nextInt();
                    }
                }
                /*
                    A = [1,2,3]     B = [7,8]
                        [4,5,6]         [9,10]
                                        [11,21]
                 */
                for (int rowIndex = 0; rowIndex < matrixRowOne; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColTwo; colIndex++) {
                        matrixResult[rowIndex][colIndex] = 0;
                        for (int k = 0; k < matrixColOne; k++) {
                            matrixResult[rowIndex][colIndex] += matrixOne[rowIndex][k] * matrixTwo[k][colIndex];
                        }
                    }
                }
                System.out.println("Result: ");
                for (int rowIndex = 0; rowIndex < matrixRowOne; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColTwo; colIndex++) {
                        System.out.print(matrixResult[rowIndex][colIndex] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Exiting...");
                break;
        }

    }
}
