public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
       int fr=0, fc=0, lr=n-1, lc=n-1;
       int count=1, total=n*n;

        int[][] res = new int[n][n];

       while(count<=total){
        for(int i=fc; i<=lc; i++){
            res[fr][i] = count++;
        }
        if(fr>lr || fc>lc) break;
        fr++;

        for(int j=fr; j<=lr; j++){
            res[j][lc] = count++;
        }
        if(fr>lr || fc>lc) break;
        lc--;

        for(int k=lc; k>=fc; k--){
            res[lr][k] = count++;
        }
        if(fr>lr || fc>lc) break;
        lr--;

        for(int i=lr; i>=fr; i--){
            res[i][fc] = count++;
        }
        if(fr>lr || fc>lc) break;
        fc++;
       }
       return res;
    }
    public static void main(String[] args){
        int n = 5;
        SpiralMatrixII sm = new SpiralMatrixII();
        int[][] matrix = sm.generateMatrix(n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
