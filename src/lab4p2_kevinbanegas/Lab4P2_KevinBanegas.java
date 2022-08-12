
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
        
        
        
        
        Object [][] tablero1 = {{' ','A','B','C','D','E','F','G','H',}, //fila 0
                                  {'1',new Torre(1, 1, 'r', false),new Caballo(1, 2, 'n', false),new Alfil(1, 3,  'b', false),new Dama(1, 4, 'q', false),new Rey(1, 5, 'k', false),new Alfil(1, 6,  'b', false),new Caballo(1, 7, 'n', false),new Torre(1, 8, 'r', false),},
                                  {'2',' ',' ',' ',' ',' ',' ',' ',' ',},
                                  {'3',' ',' ',' ',' ',' ',' ',' ',' ',},
                                  {'4',' ',' ',' ',' ',' ',' ',' ',' ',},
                                  {'5',' ',' ',' ',' ',' ',' ',' ',' ',},
                                  {'6',' ',' ',' ',' ',' ',' ',' ',' ',},
                                  {'7',' ',' ',' ',' ',' ',' ',' ',' ',},
                                  {'8',new Torre(8, 1, 'R', true),new Caballo(8, 2, 'N', true),new Alfil(8, 3,  'B', true),new Dama(8, 4, 'Q', true),new Rey(8, 5, 'K', true),new Alfil(8, 6,  'B', true),new Caballo(8, 7, 'N', true),new Torre(8, 8, 'R', true),}};
        Object [][] tablero = tablero1;
        for (int i = 0; i < 9; i++) { //For para los peones
            for (int j = 0; j < 9; j++) {
                if(i==2 && j!=0){
                    tablero[i][j]=new Peon(i,j,'p',false);
                }else if(i==7 && j!=0){
                    tablero[i][j]= new Peon(i,j,'P',true);
                } 
            }
        }
        System.out.println();
        System.out.println("TABLERO INICIAL: ");
        imprimir(tablero);
        
        boolean flag = true;
        while(flag ==true){ // while para las jugadas
            
        }
    }
    
    public static void imprimir(Object[][] tablero){
        for(int i=0; i<tablero.length; i++){
            for(int j=0; j<tablero.length; j++){
                System.out.print("[");
                if(tablero[i][j] instanceof Piezas){
                    System.out.print(((Piezas)tablero[i][j]).getNombre());
                } else{
                    System.out.print(tablero[i][j]);
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }

}
