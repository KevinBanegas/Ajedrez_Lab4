package lab4p2_kevinbanegas;

public class Dama extends Piezas{

    public Dama(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public boolean validar(Piezas[][] tablero) {
        return true;
    }


    
    
}
