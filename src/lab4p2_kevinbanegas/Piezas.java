package lab4p2_kevinbanegas;

public class Piezas {
    protected char[] coordsI;
    protected char[] coordsM;
    protected char nombre;

    public Piezas(char[] coordsI, char[] coordsM, char nombre) {
        this.coordsI = coordsI;
        this.coordsM = coordsM;
        this.nombre = nombre;
    }

    public char[] getCoordsI() {
        return coordsI;
    }

    public void setCoordsI(char[] coordsI) {
        this.coordsI = coordsI;
    }

    public char[] getCoordsM() {
        return coordsM;
    }

    public void setCoordsM(char[] coordsM) {
        this.coordsM = coordsM;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Piezas{" + "coordsI=" + coordsI + ", coordsM=" + coordsM + ", nombre=" + nombre + '}';
    }
    
    
}
