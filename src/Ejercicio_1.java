import java.util.Scanner;
import Constantes.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrNombres = {"Anabel", "Eustaquio", "Anselmo", "Mauricio", "Manolo", "Manolito", "Pedro", "Jesus", "Abalos", "Judas"};
        Double[] arrNum = {21531.64, 1824.2148, 94616.55441, 51542.51, 28714.564, 515.5474, 3238.477, 5457.6333, 858.0, 7741.9};

        for (int i = 0; i < Constantes.LOOP; i++) {
            if (i == 0){
                System.out.printf("NOMBRES ----------- NOMBRES%n");
            }
            System.out.printf("%-20s", arrNombres[i]);
            System.out.printf("%s%n", arrNombres[i]);
        }

        for (int i = 0; i < Constantes.LOOP; i++) {
            System.out.printf("%08.3f%n", arrNum[i]);
        }

        }
    }
