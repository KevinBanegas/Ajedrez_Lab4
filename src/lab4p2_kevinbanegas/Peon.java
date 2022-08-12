package lab4p2_kevinbanegas;

public class Peon extends Piezas {

    public Peon(int x, int y, char nombre, boolean color) {
        super(x, y, nombre, color);
    }
    //{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}};
    //{'1', '', '', '', '', '', '', '', ''}};
    //{'2', '', '', '', '', '', '', '', ''}};
    //{'3', '', '', '', '', '', '', '', ''}};
    //{'4', '', '', '', '', '', '', '', ''}};
    //{'5', '', '', '', '', '', '', '', ''}};
    //{'6', '', '', '', '', '', '', '', ''}};
    //{'7', '', '', '', '', '', '', '', ''}};
    //{'8', '', '', '', '', '', '', '', ''}};
    

    @Override
    public boolean validar(Piezas[][] tablero) {
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==1){
                    tablero[i][j]=new Peon(i,j,'p',false);
                }else if(i==7){
                    tablero[i][j]= new Peon(i,j,'P',true);
                }
            }
        }
        return true;
    }
}
