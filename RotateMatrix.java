public class RotateMatrix {

    /*
        Rotate a NxN matrix by 90 degrees inplace.
        Best solution has to be O(N^2) since every element has to be touched,
        and there are N^2 elements, where N refers to the matrix's length.
     */
    static void rotate(int[][] matrix) {
        int N = matrix.length;

        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {
                System.out.println("________");
                displayMatrix(matrix);

                int temp = matrix[i][j];

                //top is now left
                matrix[i][j] = matrix[N-j-1][i];

                //left is now bottom
                matrix[N-j-1][i] = matrix[N-1-i][N-1-j];

                //bottom is now right
                matrix[N-1-i][N-1-j] = matrix[j][N-1-i];

                //right is now top
                matrix[j][N-1-i] = temp;

                System.out.println("________");
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int[][] m = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotate(m);
        displayMatrix(m);

    }
}
