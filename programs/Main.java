import java.util.*;
class Main{
    public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
                int m=  sn.nextInt();
                int n= sn.nextInt();
                int[][] matrix = new int[m][n];
                for(int i=0; i<m;i++){
                                for(int j=0; j<n;j++){
                                    matrix[i][j] = sn.nextInt();
                                }
                            }
                }
        }
    // public static void main(String[] args) {
    //     Scanner sn = new Scanner(System.in);
    //         int m=  sn.nextInt();
    //         int n= sn.nextInt();
    //         int[][] matrix = new int[m][n];
    //         int[][] Tmatrix = new int[n][m];
    //         // for(int i=0; i<m;i++){
    //         //     for(int j=0; j<n;j++){
    //         //         matrix[i][j] = sn.nextInt();
    //         //     }
    //         // }
    //         // for(int i=0;i<n;i++){
    //         //     for(int j=0;j<m;j++){
    //         //         if(i==j) break;
    //         //         matrix[i][j] = matrix[j][i];
    //         //     }
    //         // }
    //         // for(int i=0; i<n;i++){
    //         //                 for(int j=0; j<m;j++){
    //         //                     System.out.print(matrix[i][j]);
    //         //                 }
    //         //                 System.out.println();
    //         // }
    // }





    //Vertical
    // public static void main(String args[]){
    //     Scanner sn = new Scanner(System.in);
    //     int m=  sn.nextInt();
    //     int n= sn.nextInt();
    //     int[][] matrix = new int[m][n];
    //     for(int i=0; i<m;i++){
    //         for(int j=0; j<n;j++){
    //             matrix[i][j] = sn.nextInt();
    //         }
    //     }
    //     for(int j=0; j<n;j++){
    //         if(j%2==0){
    //             for(int i=0; i<m;i++){
    //                 System.out.print(matrix[i][j]);
    //             }
    //         }else{
    //             for(int i=m-1; i>=0;i--){
    //                 System.out.print(matrix[i][j]);
    //             }
    //         }
    //         System.out.println();
    //     }
        
    // }

    //Horizontal
    // public static void main(String args[]){
    //     Scanner sn = new Scanner(System.in);
    //     int m=  sn.nextInt();
    //     int n= sn.nextInt();
    //     int[][] matrix = new int[m][n];
    //     for(int i=0; i<m;i++){
    //         for(int j=0; j<n;j++){
    //             matrix[i][j] = sn.nextInt();
    //         }
    //     }
    //     for(int i=0; i<m;i++){
    //         if(i%2==0){
    //             for(int j=0; j<n;j++){
    //                 System.out.print(matrix[i][j]);
    //             }
    //         }else{
    //             for(int j=n-1; j>=0;j--){
    //                 System.out.print(matrix[i][j]);
    //             }
    //         }
            
    //     }
        
    // }
}