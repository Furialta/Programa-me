package ejercicio0;

import java.util.Scanner;

/**
 *
 * @author Null_2Mares
 */
public class Ejercicio0 {

    private static String leerEntrada() {
        //jarl hectorrrrrrrrrrrrrr
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean finalDeJuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void logica() {
        //8============D
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void escribirSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("EL QUE SE ESTÁ RALLANDO ES ALBERTO!!!!!");
        boolean finalizar;
        do {
            String entrada = leerEntrada();
            if (!(finalizar = finalDeJuego())) {
                logica();
                escribirSalida();
            }
        } while (!finalizar);
    }
}
