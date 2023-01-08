import java.util.Scanner;
public class binom {
    public static void main(String[] args) {
        pascal_ucgen p = new pascal_ucgen();
        p.binom();
    }
}
class pascal_ucgen{
    Scanner girdi = new Scanner(System.in);
    public void binom(){  
        int [][] binom = new int[19][19];
        int n = 0;
        for(int i = 0; i< 19-1; i++) {
            binom[i][0] = 1;
            binom[i+1][i+1] = 1;
        }
        do{
          System.out.print("Binom acilimini gormek istediğiniz sayi n=");
          n = girdi.nextInt();
        }while(n < 0 || n >= 19);
        for(int k = 0; k < n; k++){
            for(int j = 0; j <= k+1; j++){
                if(k+1 == j||j == 0){
                    binom[k][j] = 1;
                }else{
                    binom[k+1][j] = binom[k][j-1];
                    System.out.print("");
                }
            for(int l = 0; l<n+1; l++){
                for(int m = 0; m <= l; m++){
                    System.out.print(binom[l][m]+ "\t");
                    System.out.print("");
                }
            }

            }
        }
    }
}
