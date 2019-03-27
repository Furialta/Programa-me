package ejercicio0;

import java.util.Scanner;

/**
 *
 * @author Null_2Mares
 */
public class Ejercicio0 {

    private static String leerEntrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean finalDeJuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void logica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void escribirSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("HÉCTOR NO TE RALLES QUE VAMOS A GANAR!!!!!");
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
