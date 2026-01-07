class Solution {
    public void setZeroes(int[][] arr) {
    

        boolean[] rowZero = new boolean[arr.length];
        boolean[] colZero = new boolean[arr[0].length];

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

   
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (rowZero[i] || colZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}

 