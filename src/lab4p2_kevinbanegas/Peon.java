package lab4p2_kevinbanegas;

public class Peon extends Piezas {

    public Peon(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }
    @Override
    public boolean validar(String mover, Object[][] tablero) {
        
//        if((x==a && y==b-1)&& ((tablero[a][b] instanceof Piezas)==false)){
//            return true;
//        }else if(((x==a-1 || x==a+1) && b==y-1)&& tablero[a][b] instanceof Piezas){
//            if(((Piezas)(tablero[a][b])).getColor()!=((Piezas)(tablero[x][y])).getColor()){
//                return true;
//            }
//        }
        
        return false;
    }
}
