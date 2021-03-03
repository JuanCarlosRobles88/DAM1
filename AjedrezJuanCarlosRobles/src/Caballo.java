
public class Caballo extends Pieza {

    public Caballo(int color, String nombre) {
        super(color, nombre);
    }
	
    public Caballo (int color){
        super(color);
    }
	
    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal())==2 && Math.abs(mov.saltoVertical())==1)||(Math.abs(mov.saltoHorizontal())==1 && Math.abs(mov.saltoVertical())==2)){
            respuesta=true;
        }
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Movimiento en L: 2,1 ó 1,2");
    }
}
