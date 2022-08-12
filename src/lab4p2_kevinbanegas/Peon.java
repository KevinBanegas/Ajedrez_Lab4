package lab4p2_kevinbanegas;

public class Peon extends Piezas {

    public Peon(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }
    @Override
    public boolean validar(Object[][] tablero, int a, int b) {
        
        if((a==x && b==y-1)&&tablero[a][b]==' '){
            return true;
        }else if(((a==x-1 || a==x+1) && b==y-1)&& tablero[a][b] instanceof Piezas){
            if(((Piezas)(tablero[a][b])).getColor()!=((Piezas)(tablero[x][y])).getColor()){
                return true;
            }
        }
        return false;
    }
}
