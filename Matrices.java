package matrices;

import java.util.InputMismatchException;
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatrixOperation op = new MatrixOperation();
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

            boolean isError;
            switch (option) {
                case 1:
                    isError = true;
                    while (isError) {
                        try {
                            System.out.println("Addition Matrix");
                            System.out.print("Enter size of Matrix: ");

                            matrixSize = input.nextInt();
                            matrixOne = op.getMatrixInput(input, matrixSize, "First");
                            matrixTwo = op.getMatrixInput(input, matrixSize, "Second");
                            matrixResult = op.addMatrices(matrixOne, matrixTwo, matrixSize);
                            //display the result
                            op.displayResult(matrixResult, matrixSize);

                            isError = false;
                        } catch (InputMismatchException ex) {
                            System.out.println("You must enter a number!");
                            input.next();
                        }
                    }

                    break;
                case 2:
                    isError = true;

                    while (isError) {
                        try {
                            System.out.println("Subtraction Matrix");
                            System.out.print("Enter size of Matrix: ");

                            matrixSize = input.nextInt();
                            matrixOne = op.getMatrixInput(input, matrixSize, "First");
                            matrixTwo = op.getMatrixInput(input, matrixSize, "Second");
                            matrixResult = op.subtractMatrices(matrixOne, matrixTwo, matrixSize);
                            //display the result
                            op.displayResult(matrixResult, matrixSize);

                            isError = false;
                        } catch (InputMismatchException ex) {
                            System.out.println("You must enter a number!");
                            input.next();
                        }
                    }

                    break;
                case 3:
                    System.out.println("Multiplication Matrix");

                    System.out.print("Number of rows of First Matrix: ");
                    matrixRowOne = input.nextInt();

                    System.out.print("Number of column of First Matrix: ");
                    matrixColOne = input.nextInt();

                    System.out.print("Number of rows of Second Matrix: ");
                    matrixRowTwo = input.nextInt();

                    System.out.print("Number of column of Second Matrix: ");
                    matrixColTwo = input.nextInt();

                    if (matrixColOne != matrixRowTwo) {
                        System.out.println("Two sizes are not match.");
                        break;
                    }

                    matrixOne = op.getMatrixInput(input, matrixRowOne, matrixColOne, "First");
                    matrixTwo = op.getMatrixInput(input, matrixRowTwo, matrixColTwo, "Second");

                    matrixResult = op.multiplyMatrices(matrixOne, matrixTwo, matrixRowOne, matrixColOne, matrixColTwo);
                    op.displayResult(matrixResult, matrixRowOne, matrixColTwo);

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

                    matrixOne = op.getMatrixInput(input, matrixRowOne, matrixColOne, "Scalar");

                    matrixResult = op.multiplyScalarMatrices(matrixOne, matrixRowOne, matrixColOne, scalar);
                    op.displayResult(matrixResult, matrixRowOne, matrixColOne);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);

                    break;
                default:
                    System.out.println("Invalid Input Please Try Again.");
                    break;
            }

            System.out.print("Do you want to try again? [Y] \nPress any key to exit : ");
            again = input.next().charAt(0);
            input.nextLine();
        } while (again == 'Y' || again == 'y');
        input.close();
    }
}
