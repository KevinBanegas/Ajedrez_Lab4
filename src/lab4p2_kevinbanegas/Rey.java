package lab4p2_kevinbanegas;

public class Rey extends Piezas{

    public Rey(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }
    
    @Override
    public boolean validar(String mover, Object[][] tablero){
       // if(x==a && y==b+1 || x==a && y==b-1 || x==a+1 && y==b || x==a-1 && y==b || )
        return false;
    }
    
}
