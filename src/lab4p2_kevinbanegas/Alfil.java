
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
        int pos1;
        int pos2;
        int contP=0;
        int cont1=1;
        int cont2=1;
        
        if((x1 !=x2) &&(y1!=y2)){ //validacion para solo moverse en diagonal
          if(x1>x2){ //up-derecha o up-izquierda
              int moves = x1-x2;
              if(x2==x1-moves){ //up-izquierda
                  pos1=x1-cont1;
                  pos2=y1-cont2;
                  while(moves>1){
                      if(tablero[pos1][pos2] instanceof Piezas){
                         contP++; 
                      }
                      cont1++;
                      cont2++;
                      moves--;
                  }
                  if(contP==0 && (tablero[x2][y2] instanceof Piezas)==false){
                      return true;
                  } else if(contP==0 && ((Piezas)tablero[x2][y2]).getColor()!=((Piezas)tablero[x1][y1]).getColor()){
                      return true;
                  } else {
                      return false;
                  }
              }
              
          }
        } else {
            return false;
        }
     return false;
    }

}
