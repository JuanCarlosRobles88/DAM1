
public class Torre extends Pieza {

    public Torre(int color, String nombre) {
        super(color, nombre);
    }
	
    public Torre (int color){
        super(color);
    }
	
    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if (mov.esVertical() || mov.esHorizontal()) {
            respuesta=true;
	}
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Horizontal o Vertical");
    }
}
