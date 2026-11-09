import Constantes.*;

import java.util.Random;

public class Ejercicio_3 {
    // array de tipo entero donde guardar mis 5 notas. Son del 0 al 100
    public static void main(String[] args) {
        int[][][] arrNotas = new int[Constantes.MAX_NUM_ASIGNATURAS][Constantes.MAX_NUM_ALUMNOS][Constantes.MAX_NUM_NOTAS];

        Random rand = new Random();

        for (int iPosAsign = 0; iPosAsign < Constantes.MAX_NUM_ASIGNATURAS; iPosAsign++) {
            for (int iPosAlumno = 0; iPosAlumno < Constantes.MAX_NUM_ALUMNOS; iPosAlumno++) {
                for (int iPosNota = 0; iPosNota < Constantes.MAX_NUM_NOTAS; iPosNota++) {
                    arrNotas[iPosAsign][iPosAlumno][iPosNota] = rand.nextInt(101);
                }

            }
        }

        for (int iPosAsign = 0; iPosAsign < Constantes.MAX_NUM_ASIGNATURAS; iPosAsign++) {
            for (int iPosAlumno = 0; iPosAlumno < Constantes.MAX_NUM_ALUMNOS; iPosAlumno++) {
                for (int iPosNota = 0; iPosNota < Constantes.MAX_NUM_NOTAS; iPosNota++) {
                    System.out.printf("Asignatura: %s - Alumno: %s --> Nota: %03d%n", iPosAsign+1, iPosAlumno+1, arrNotas[iPosAsign][iPosAlumno][iPosNota]);
                }
            }
        }



    }
}