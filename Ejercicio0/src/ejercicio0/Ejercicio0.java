package ejercicio0;

import java.util.Scanner;

/**
 *
 * @author Null_2Mares
 */
public class Ejercicio0 {

    private static String leerEntrada() {
        
    }

    private static boolean finalDeJuego() {
        
    }

    private static void logica() {
        
    }

    private static void escribirSalida() {
        
    }
        Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
