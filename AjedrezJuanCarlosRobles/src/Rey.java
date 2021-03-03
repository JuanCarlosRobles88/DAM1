
public class Rey extends Pieza{
    
    public Rey(int color, String nombre) {
        super(color, nombre);
    }
	
    public Rey (int color){
        super(color);
    }
	
    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal())==1 && Math.abs(mov.saltoVertical())==1)||(Math.abs(mov.saltoHorizontal())==1 || Math.abs(mov.saltoVertical())==1)) {
            respuesta=true;
	}
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Diagonal derecha , diagonal izquierda, horizontal o vertical");
    }    
}
