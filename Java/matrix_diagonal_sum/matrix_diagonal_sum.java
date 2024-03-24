class Solution {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        int x = 0;
        int y = mat.length - 1;
        int skip = mat.length / 2;
        
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat.length % 2 != 0){
                    if(i == j && (i != skip && j != skip)){
                        result = result + mat[i][j];
                    }
                } else {
                    if(i == j){
                        result = result + mat[i][j];
                    }
                }
            }
        }

        for(int i = 0; i<mat.length; i++){
            for(int j = mat.length-1; j>=0; j--){
                if(i == x && y == j){
                    result = result + mat[i][j];
                    y--;
                    x++;
                }
            }
        }

        return result;
    }
}