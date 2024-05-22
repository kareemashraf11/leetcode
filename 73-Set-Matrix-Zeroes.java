class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>(), cols = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i : rows)
            Arrays.fill(matrix[i], 0);
        for(int i : cols) {
            for(int j = 0; j < matrix.length; j++)
                matrix[j][i] = 0;
        }
    }
}