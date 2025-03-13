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
    
    
//    public static int[] getMatrixResult(int[] matrixOne,int[] matrixTwo){
//        
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
       
        displayOption();
        option = input.nextInt();
        input.nextLine();

        switch (option) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                System.out.print("Number of rows of First Matrix: ");
                int matrixRowOne = input.nextInt();

                System.out.print("Number of column of First Matrix: ");
                int matrixColOne = input.nextInt();

                System.out.print("Number of rows of Second Matrix: ");
                int matrixRowTwo = input.nextInt();

                System.out.print("Number of column of First Matrix: ");
                int matrixColTwo = input.nextInt();

                if (matrixColOne != matrixRowTwo) {
                    System.out.println("Two sizes are not match.");
                    break;
                }
                int[][] matrixOne = new int[matrixRowOne][matrixColOne];
                int[][] matrixTwo = new int[matrixRowTwo][matrixColTwo];
                int[][] matrixResult = new int[matrixRowOne][matrixColTwo];

                for (int rowIndex = 0; rowIndex < matrixRowOne; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColOne; colIndex++) {
                        System.out.println("Enter Matrix One number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
                        matrixOne[rowIndex][colIndex] = input.nextInt();
                    }
                }
                for (int rowIndex = 0; rowIndex < matrixRowTwo; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColTwo; colIndex++) {
                        System.out.println("Enter Matrix Two number in index [" + (rowIndex + 1) + "] [" + (colIndex + 1) + "]: ");
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

                for (int rowIndex = 0; rowIndex < matrixRowOne; rowIndex++) {
                    for (int colIndex = 0; colIndex < matrixColTwo; colIndex++) {
                        System.out.print(matrixResult[rowIndex][colIndex] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                break;
        }

    }
}
