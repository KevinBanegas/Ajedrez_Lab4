package lab4p2_kevinbanegas;

public class Rey extends Piezas{

    public Rey(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }
    
    @Override
    public boolean validar(Piezas[][] tablero){
        return true;
    }
    
}