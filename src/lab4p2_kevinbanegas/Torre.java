package lab4p2_kevinbanegas;

public class Torre extends Piezas {

    public Torre(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }

    @Override
    public String toString() {
        return super.toString();
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

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
        if (x2 == x1) {
            System.out.println("AAA!");
            while(y1!=y2){
                if(tablero[y1][x2] instanceof Piezas == true){
                    if(y1==y2-1 && (((Piezas)(tablero[y1][x2])).getColor()!=((Piezas)(tablero[y1][x1])).getColor())){
                        return true;
                    }else if(y1!=y2-1){
                        return false;
                    }
                }else{
                    if(y1==y2-1){
                        return true;
                    }
                }
            }
        } else if (y2 == y1) {
            System.out.println("AAA");
            for (int i = x1+1; i < x2; i++) {
                if(tablero[y2][i] instanceof Piezas == true){
                    System.out.println("F");
                    if(((Piezas)(tablero[y2][i])).getColor()!=((Piezas)(tablero[y1][x1])).getColor()){
                        System.out.println("a");
                        return true;
                    }else if(i!=x2-1){
                        System.out.println("b");
                        return false;
                    }
                }else{
                    System.out.println("F");
                    if(i==x2-1){
                        System.out.println("c");
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
