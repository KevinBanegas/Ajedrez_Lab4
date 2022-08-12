
package lab4p2_kevinbanegas;

public class Torre extends Piezas{

    public Torre(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean validar(String mover,Object[][] tablero) {
        
        
        return true;
    }
    
}
