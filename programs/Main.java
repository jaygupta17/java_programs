import java.util.*;
class Main{
    public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
                int m=  sn.nextInt();
                int n= sn.nextInt();
                int k = sn.nextInt();
                int l = sn.nextInt();
                int[][] m1 = new int[m][n];
                int[][] m2 = new int[k][l];
                int[][] result = new int[m][l];
                if (n!=k) {
                    System.out.println("Error");
                    return;
                }
                for(int i=0; i<m;i++){
                    for(int j=0; j<n;j++){
                        m1[i][j] = sn.nextInt();
                    }
                }
                for(int i=0; i<k;i++){
                    for(int j=0; j<l;j++){
                        m2[i][j] = sn.nextInt();
                    }
                }   

                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        result[i][j] += m2[j][i]*m1[i][j];
                    }
                }
                for(int i=0; i<m;i++){
                    for(int j=0; j<l;j++){
                        int a=0;
                        for(int o=0;o<m;o++){}
                    }
                    System.out.println();
                }
                
                }

              
    }
        // }
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
