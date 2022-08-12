
package lab4p2_kevinbanegas;

import java.util.Scanner;

public class Lab4P2_KevinBanegas {

    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Nombre Jugador 1: ");
        String nombre1 = lea.nextLine();
        System.out.print("Nombre Jugador 2: ");
        String nombre2 = lea.nextLine();
        
        Object [][] tablero = new Object [9][9]; //Colocar peones en el tablero
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==2){
                    tablero[i][j]=new Peon(i,j,'p',false);
                }else if(i==7){
                    tablero[i][j]= new Peon(i,j,'P',true);
                } 
            }
        }
        System.out.println();
        System.out.println("TABLERO INICIAL: ");
        System.out.println();
        imprimir(tablero);
        boolean flag = true;
        while(flag ==true){
            
        }
    }
    
    public static void imprimir(Object[][] tablero){
        for(int i=0; i<tablero.length; i++){
            for(int j=0; j<tablero.length; j++){
                System.out.print("[");
                if(tablero[i][j] instanceof Piezas){
                    System.out.print(((Piezas)tablero[i][j]).getNombre());
                }else{
                    System.out.print(" ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }

}
