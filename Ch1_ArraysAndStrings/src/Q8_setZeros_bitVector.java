import java.util.Random;

public class Q8_setZeros_bitVector {
    static void setZeros(int[][] matrix) {
        int bitRow = 0;
        int bitCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    bitRow = toggle(bitRow, i);
                    bitCol = toggle(bitCol, j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (((bitRow >> i) & 1) == 1){
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (((bitCol >> j) & 1) == 1) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    static int toggle(int bitVector, int index) {
        if (index < 0 ) return bitVector;
        int mask = 1 << index;
        bitVector = bitVector | mask;
        return bitVector;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[5][7];
        int val = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                Random ran = new Random();
                matrix[i][j] = ran.nextInt(10);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        setZeros(matrix);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}