import java.util.Scanner;

public class Hamza_SE_4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][4];
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=2; j<4;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=2;i<4;i++){
            for(int j=0; j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=2;i<4;i++){
            for(int j=2; j<4;j++){
                arr[i][j] = sc.nextInt();
            }
        }
      for(int i=0 ; i<4 ;i++){
          for(int j=0;j<4;j++){
              System.out.println("("+i+","+j+")"+ arr[i][j]);
          }
      }
      int [][] arr2 = new int[2][2];
      int x=0;
      int y=0;
        for(int i=0;i<2;i++){
            for(int j=0; j<2;j++){
                if(arr[i][j]>=arr2[x][y]){
                    arr2[x][y] = arr[i][j];
                }
            }
        }
        y++;
        for(int i=0;i<2;i++){
            for(int j=2; j<4;j++){
                if(arr[i][j]>=arr2[x][x]){
                    arr2[x][y] = arr[i][j];
                }
            }
        }
        x++;
        y=0;
        for(int i=2;i<4;i++){
            for(int j=0; j<2;j++){
                if(arr[i][j]>=arr2[x][x]){
                    arr2[x][y] = arr[i][j];
                }
            }
        }
        y++;
        for(int i=2;i<4;i++){
            for(int j=2; j<4;j++){
                if(arr[i][j]>=arr2[x][x]){
                    arr2[x][y] = arr[i][j];
                }
            }
        }
        for(int i=0 ; i<2 ;i++){
            for(int j=0;j<2;j++){
                System.out.println("("+i+","+j+")"+ arr2[i][j]);
            }
        }
        int [][] arr3 = new int[1][2];
        x=0;
        y=0;
        int a=0;
        int b=0;

        for(int i=0;i<arr2.length;i++){
            for(int j=0 ; j<arr2.length;j++)
            {
               if(arr2[i][j]>=a){
                   b=a;
                   a = arr2[i][j];
               }
            }
        }
        arr3[0][0] = a;
        arr3[0][1] = b;
        for(int i=0 ; i<1 ;i++){
            for(int j=0;j<2;j++){
                System.out.println("("+i+","+j+")"+ arr3[i][j]);
            }
        }

    }
}
