
package lab4p2_kevinbanegas;

import java.awt.Color;

public class Alfil extends Piezas{

    public Alfil(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean validar(String mover, Object[][] tablero) {
        
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
        
        int contP=0;
        int movesD2=x1-x2;
        int m=movesD2;
        int xn;
        int cont1=x1-1;
        int cont2=y1+1;
        boolean color1 =((Piezas)tablero[x1][y1]).getColor(); //true blanco
        while(movesD2>0){ 
            if(x2==x1-m && y2==y1-m){ // Up-dereha 
                if((tablero[cont1][cont2] instanceof Piezas) && (color1==((Piezas)tablero[cont1][cont2]).getColor())){
                    contP++;
                }
            }
            movesD2--;
        }
        if(contP==0){
            return true;
        }
       return false;
    }

}
