import java.util.Scanner;

public class PiramideDos1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("coloque o valor da altura da piramide: ");
        int n = scanner.nextInt();
        int copia_n = n;
        for(int i=1; i<=n; i++){
            for(int espaco=copia_n-1; espaco>0; espaco--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("1 ");
            }
            System.out.print("\n");
            copia_n--;
        }
    }
}

//---1----
//--1-1---
//-1-1-1--
//1-1-1-1-