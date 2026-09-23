// https://www.geeksforgeeks.org/problems/multiply-2-matrices4144/1
package Arrays.Array2D;

import java.util.ArrayList;

public class matrixProduct {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

        for (int i = 0; i < mat1.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < mat1[i].length; j++) {
                int productSum = 0;

                for (int k = 0; k < mat2.length; k++) {
                    productSum = productSum + (mat1[i][k] * mat2[k][j]);
                }

                list.add(productSum);

            }

            list2d.add(list);
        }

        return list2d;
    }
}
