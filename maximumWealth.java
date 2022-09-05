class Solution {
    public int maximumWealth(int[][] acc) {
        int x = 0;
        for(int i = 0; i < acc.length; i++){
            int y = 0;
            for(int j = 0; j < acc[i].length; j++){
                y += acc[i][j];
                if (y > x){
                    x = y;
                }
            }
        }
        return x;
    }
}
