package POO.LH2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        //Código que arroja excepción
        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println(mensajeFinal);
        }

        ArrayList<String> list = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

    }

}
