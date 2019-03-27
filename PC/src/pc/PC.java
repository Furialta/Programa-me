package pc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import static pc.PC.Participantes;

/**
 *
 * @author Null_2Mares
 */
public class PC {

    //ATRIBUTOS GLOBALES    
    static Scanner sc = new Scanner(System.in);
    int contador;
    String entrada;

    static ArrayList<Participante> Participantes = new ArrayList();

    boolean comprueba;

    public static void main(String[] args) {
        boolean finalizar;

        String entrada = leerEntrada();

        logica();
        escribirSalida();
        ;
    }

    private static String leerEntrada() {

        int nParticipantes;
        String nombreParticipante;
        int puntuacion;
        float tiempo;

        Participante participante;
        nParticipantes = sc.nextInt();

        for (int i = 0; i < nParticipantes; i++) {
            sc.nextLine();
            nombreParticipante = sc.nextLine();

            puntuacion = sc.nextInt();

            tiempo = sc.nextFloat();

            Participantes.add(new Participante(nombreParticipante, puntuacion, tiempo));

        }

        return null;
    }

    private static void logica() {
        int[] pPosicion = {100, 80, 60, 50, 45, 40, 36, 32, 29, 26, 24, 22, 20, 18, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int contador = 0;
        float t;

        for (int i = 0; i < Participantes.size(); i++) {
            contador = 0;
            Participante unParticipante = Participantes.get(i);
            for (int j = 0; j < Participantes.size(); j++) {
                t = unParticipante.tiempo;
                if (t > Participantes.get(j).tiempo) {
                    contador++;

                }
            }
            unParticipante.puntuacion += pPosicion[contador];
            Participantes.set(i, unParticipante);

        }

    }

    private static void escribirSalida() {
        Collections.sort(Participantes, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Participante p1 = (Participante) o1;
                Participante p2 = (Participante) o2;
                return new Integer(p2.puntuacion).compareTo(new Integer((p1.puntuacion)));
            }
        });
        for (int i = 0; i < Participantes.size(); i++) {
            System.out.println(Participantes.get(i).puntuacion + " " + Participantes.get(i).nombre);
        }
    }

    private static boolean finalDeJuego() {

        return false;
    }
}

class Participante {

    String nombre;
    public int puntuacion;
    float tiempo;

    public Participante(String nombre, int puntuacion, float tiempo) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.tiempo = tiempo;
    }

}