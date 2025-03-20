package matrices;

interface Matrix {

    int[][] addMatrices(int[][] matrixOne, int[][] matrixTwo, int matrixSize);

    int[][] subtractMatrices(int[][] matrixOne, int[][] matrixTwo, int matrixSize);

    int[][] multiplyMatrices(int[][] matrixOne, int[][] matrixTwo, int rowsOne, int colsOne, int colsTwo);

    int[][] multiplyScalarMatrices(int[][] matrix, int rows, int cols, int scalar);

    int[][] transposeMatrix(int[][] matrix, int rows, int cols);
}
