package lab4p2_kevinbanegas;

public abstract class Piezas implements ValidarMovimientos{
    protected int x;
    protected int y;
    protected char nombre;
    protected boolean color;

    public Piezas(int x, int y, char nombre, boolean color) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piezas{" + "x=" + x + ", y=" + y + ", nombre=" + nombre + ", color=" + color + '}';
    }
    
  
    public abstract boolean validar(String mover, Object [][] tablero);
    
}
