import java.util.Scanner;
import Constantes.*;

public class Ejercicio_2 {
    // vamos a mostrar 8 numeros de 5 digitos rellenamos con espacios y alineamos a izquierda
    public static void main(String[] args) {
        int[] arrNumInt = {134, 29244, 664, 1249, 12, 99, 1, 23};

        for (int i = 0; i < Constantes.LOOP2; i++) {
            System.out.printf("%-5d%n", arrNumInt[i]);
        }


    }
}
