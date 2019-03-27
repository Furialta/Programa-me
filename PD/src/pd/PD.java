package pd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Null_2Mares
 */
public class PD {
    
    
    //ATRIBUTOS GLOBALES    
    Scanner sc = new Scanner(System.in);
    int contador;
    String entrada;
    List<String> lista = new ArrayList();
    boolean comprueba;    
    
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

    private static String leerEntrada() {  
        return null;
    }


    private static void logica() {
        
    
    
    
    
    
    
    }

    
    
    
    private static void escribirSalida() {
        
    }
    
    private static boolean finalDeJuego() {
        
    
    
        return false;
    }
}
