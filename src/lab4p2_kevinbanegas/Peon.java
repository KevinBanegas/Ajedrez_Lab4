package lab4p2_kevinbanegas;

public class Peon extends Piezas {

    public Peon(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }
//{" ", " ", " ", " ", " ", " ", " ", " ", " "}};
    @Override
    public boolean validar(char[][] tablero) {
        return true;
    }
}
