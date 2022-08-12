
package lab4p2_kevinbanegas;

public class Alfil extends Piezas{

    public Alfil(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean validar(Object[][] tablero, int a, int b) {
       return true;
    }

}
