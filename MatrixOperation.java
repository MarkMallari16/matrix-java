package matrices;

import java.util.Scanner;

public class MatrixOperation implements Matrix {

    public int[][] getMatrixInput(Scanner input, int matrixSize, String name) {
        int[][] matrix = new int[matrixSize][matrixSize];

        System.out.println("Enter values for " + name + " matrix: ");

        for (int rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
            for (int colIndex = 0; colIndex < matrixSize; colIndex++) {
                System.out.println("Enter " + name + " First Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                matrix[rowIndex][colIndex] = input.nextInt();
            }
        }

        return matrix;
    }

    public int[][] getMatrixInput(Scanner input, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter values for " + name + " matrix: ");

        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                System.out.println("Enter " + name + " First Matrix number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                matrix[rowIndex][colIndex] = input.nextInt();
            }
        }

        return matrix;
    }

    @Override
    public int[][] addMatrices(int[][] matrixOne, int[][] matrixTwo, int matrixSize) {
        int[][] matrixResult = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixResult[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        return matrixResult;
    }

    @Override
    public int[][] subtractMatrices(int[][] matrixOne, int[][] matrixTwo, int matrixSize) {
        int[][] matrixResult = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixResult[i][j] = matrixOne[i][j] - matrixTwo[i][j];
            }
        }

        return matrixResult;
    }

    @Override
    public int[][] multiplyMatrices(int[][] matrixOne, int[][] matrixTwo, int rowsOne, int colsOne, int colsTwo) {
        int[][] matrixResult = new int[rowsOne][colsTwo];

        for (int i = 0; i < rowsOne; i++) {
            for (int j = 0; j < colsTwo; j++) {
                int sum = 0;
                for (int k = 0; k < colsOne; k++) {
                    sum += matrixOne[i][k] * matrixTwo[k][j];
                }
                matrixResult[i][j] = sum;
            }
        }

        return matrixResult;
    }

    @Override
    public int[][] multiplyScalarMatrices(int[][] matrix, int rows, int cols, int scalar) {
        int[][] matrixResult = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixResult[i][j] = scalar * matrix[i][j];
            }
        }

        return matrixResult;
    }

    public void displayResult(int[][] matrixResult, int matrixSize) {

        System.out.println("Result:");
        for (int rowIndex = 0; rowIndex < matrixSize; rowIndex++) {
            for (int colIndex = 0; colIndex < matrixSize; colIndex++) {
                System.out.print(matrixResult[rowIndex][colIndex] + " \t");
            }
            System.out.println();
        }
    }

    //override for multiplication
    public void displayResult(int[][] matrixResult, int rows, int cols) {

        System.out.println("Result:");
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                System.out.printf("%4d\t", matrixResult[rowIndex][colIndex]);
            }
            System.out.println();
        }
    }

    public void displayTransposeResult(int[][] matrixResult, int rows, int cols) {
        System.out.println("Result:");
        for (int rowIndex = 0; rowIndex < cols; rowIndex++) {
            for (int colIndex = 0; colIndex < rows; colIndex++) {
                System.out.printf("%4d\t", matrixResult[rowIndex][colIndex]);
            }
            System.out.println();
        }
    }

    @Override
    public int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        //2 3
        int[][] matrixResult = new int[cols][rows];
        /*
        3 5
        8 1 
        4 6
        
        row = 2
        col = 3
        
        rowIndex = 2
        colIndex = 0        
        3 
         */
        
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                matrixResult[colIndex][rowIndex] = matrix[rowIndex][colIndex];
                /*
                    3 8 4
                    5 1 6
                 */
            }
        }

        return matrixResult;
    }
}
