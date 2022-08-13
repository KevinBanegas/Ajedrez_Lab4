package lab4p2_kevinbanegas;

public class Rey extends Piezas {

    public Rey(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }

    @Override
    public boolean validar(String mover, Object[][] tablero) {
        String x11 = "";
        String x22 = "";
        x11 += mover.charAt(3);
        int x1 = Integer.parseInt(x11);
        x22 += mover.charAt(6);
        int x2 = Integer.parseInt(x22);
        int y1 = 0;
        int y2 = 0;
        switch (mover.charAt(2)) {
            case 'a': {
                y1 = 1;
            }
            break;
            case 'b': {
                y1 = 2;
            }
            break;
            case 'c': {
                y1 = 3;
            }
            break;
            case 'd': {
                y1 = 4;
            }
            break;
            case 'e': {
                y1 = 5;
            }
            break;
            case 'f': {
                y1 = 6;
            }
            break;
            case 'g': {
                y1 = 7;
            }
            break;
            case 'h': {
                y1 = 8;
            }
            break;
        }
        switch (mover.charAt(5)) {
            case 'a': {
                y2 = 1;
            }
            break;
            case 'b': {
                y2 = 2;
            }
            break;
            case 'c': {
                y2 = 3;
            }
            break;
            case 'd': {
                y2 = 4;
            }
            break;
            case 'e': {
                y2 = 5;
            }
            break;
            case 'f': {
                y2 = 6;
            }
            break;
            case 'g': {
                y2 = 7;
            }
            break;
            case 'h': {
                y2 = 8;
            }
            break;
        }

        if ((x1 == x2 && y1 == y2 - 1) || (x1 == x2 && y1 == y2 + 1) || (x1 == x2 - 1 && y1 == y2 - 1) || (x1 == x2 + 1 && y1 == y2 - 1) || (x1 == x2 - 1 && y1 == y2 + 1) || (x1 == x2 + 1 && y1 == y2 + 1) || (x1 == x2 - 1 && y1 == y2) || (x1 == x2 + 1 && y1 == y2)) {

            if (tablero[x2][y2] instanceof Piezas) {
                if (((Piezas) (tablero[x2][y2])).getColor() != ((Piezas) (tablero[x1][y1])).getColor()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

}
