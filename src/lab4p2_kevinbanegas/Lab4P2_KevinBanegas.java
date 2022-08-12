
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
            System.out.print("Ingrese la instruccion: ");
            String ins = lea.next();
            
            
            String x11 ="";
            x11 += ins.charAt(3);
            int x1 = Integer.parseInt(x11);
            int y1=0;

            switch(ins.charAt(2)){
                case 'a':{
                   y1=1;

                }
                break;
                case 'b':{
                   y1=2;

                }
                break;
                case 'c':{
                   y1=3;

                }
                break;
                case 'd':{
                   y1=4;

                }
                break;
                case 'e':{
                   y1=5;

                }
                break;
                case 'f':{
                   y1=6;

                }
                break;
                case 'g':{
                   y1=7;

                }
                break;
                case 'h':{
                   y1=8;

                }
                break;
            }
            
            if(((Piezas)tablero[x1][y1]).validar(ins, tablero)==true){
            tablero =movimiento(ins, tablero);
            imprimir(tablero);
            } else{
                System.out.println("Movimiento invalida.");
            }
        }//fin while
    }//fin main
    
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
    
    public static Object[][] movimiento(String mover, Object [][] tablero){
        Object [][] temp = tablero;
        String x11 ="";
        String x22="";
        x11 += mover.charAt(3);
        int x1 = Integer.parseInt(x11);
        x22+=mover.charAt(6);
        int x2 = Integer.parseInt(x22);
        int y1=0;
        int y2=0;
        
        switch(mover.charAt(2)){
            case 'a':{
               y1=1;
               
            }
            break;
            case 'b':{
               y1=2;
               
            }
            break;
            case 'c':{
               y1=3;
               
            }
            break;
            case 'd':{
               y1=4;
               
            }
            break;
            case 'e':{
               y1=5;
               
            }
            break;
            case 'f':{
               y1=6;
               
            }
            break;
            case 'g':{
               y1=7;
               
            }
            break;
            case 'h':{
               y1=8;
               
            }
            break;
        }
        
        switch(mover.charAt(5)){
            case 'a':{
              
               y2=1;
            }
            break;
            case 'b':{
               
               y2=2;
            }
            break;
            case 'c':{
               
               y2=3;
            }
            break;
            case 'd':{
              
               y2=4;
            }
            break;
            case 'e':{
               
               y2=5;
            }
            break;
            case 'f':{
               
               y2=6;
            }
            break;
            case 'g':{
               
               y2=7;
            }
            break;
            case 'h':{
               
               y2=8;
            }
            break;
        }
        
        Object var = temp[x1][y1];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if(i==x1 && j==y1){
                    temp[x1][y1]=' ';
                } else if(i==x2 && j==y2){
                    temp[x2][y2]=var;//((Piezas)var).getNombre();
                }
            }
        }
        return temp;
    }

}
