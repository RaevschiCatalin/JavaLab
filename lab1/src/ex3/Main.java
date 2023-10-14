package ex3;

public class Main {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(args[2 + i * cols + j]);
            }
        }

        System.out.println(getContourSize(matrix));
    }

    public static int getContourSize(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int contourValue = matrix[0][0];
        
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] != contourValue || matrix[i][cols - 1] != contourValue) {
                return 0;
            }
        }
        
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] != contourValue || matrix[rows - 1][j] != contourValue) {
                return 0;
            }
        }
        
        return 1;
    }
}

