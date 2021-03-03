
public class Alfil extends Pieza{
    
    public Alfil(int color, String nombre) {
        super(color, nombre);
    }
	
    public Alfil (int color){
        super(color);
    }
	
    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if (mov.esDiagonal()) {
            respuesta=true;
	}
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Diagonal derecha o diagonal izquierda");
    }
}
