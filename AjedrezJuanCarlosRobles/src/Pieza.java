
public abstract class Pieza {
	
    protected int color; //0 blancas 1 negras (Recomendación del mismo tipo que el turno del Juego), boolean o String 
    protected String nombre;

    public Pieza(int color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public Pieza(int color) {
        this.color = color;
        if (color == 0) {
            nombre =this.getClass().getSimpleName().charAt(0)+"b";
        } else {
            nombre = this.getClass().getSimpleName().charAt(0)+"n";
	}
    }
	
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract boolean esValidoMovimiento(Movimiento mov, Tablero tabla);
	
    public abstract void informarMovimiento();
	
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "color=" + color + ", nombre=" + nombre + '}';
    }
}
