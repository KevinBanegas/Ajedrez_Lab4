package lab4p2_kevinbanegas;

public class Peon extends Piezas {

    public Peon(char[] coordsI, char[] coordsM, char nombre) {
        super(coordsI, coordsM, nombre);
    }

    @Override
    public boolean validar(char[][] tablero) {
        return true;
    }
}
