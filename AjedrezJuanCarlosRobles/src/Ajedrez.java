
import java.util.Scanner;

public class Ajedrez {
    
    public static void main(String[] args) {
        
        Juego juego = new Juego();
        Movimiento mov = null;
        String jugada = new String();
        Scanner lector = new Scanner(System.in);
        Tablero tabla = new Tablero();
		
        do {
            tabla.pintarTablero();
            juego.mostrarTurno();
            System.out.println("Introduce jugada");
            jugada = lector.nextLine();
            mov = juego.dameMovimiento(jugada, tabla);
            //System.out.println(mov);
			
            if (mov != null) {
                if (tabla.tablero[mov.posIni.fila][mov.posFin.columna].esValidoMovimiento(mov,tabla)) {
                    tabla.mover(mov);
                    juego.cambiaTurno();
                } else {
                    System.out.println("movimiento no válido");
                    tabla.tablero[mov.posIni.fila][mov.posIni.columna].informarMovimiento();
                }
            }
            //llamar a la pieza de la posicion inicial y preguntarle si puede realizar movimiento
        } while (!jugada.equalsIgnoreCase("fin"));
    }
}
