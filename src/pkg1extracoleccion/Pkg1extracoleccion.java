package Pkg1extracoleccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pkg1extracoleccion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listanumeros = new ArrayList();
        Integer num;
        int suma = 0;
        double promedio;

        do {

            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num != (-99)) {
                suma = suma + num;
                listanumeros.add(num);

            }

        } while (num != (-99));
        System.out.println("Cantidad de números ingresados: " + listanumeros.size());
        System.out.println("La suma total de los números de la lista son: " + suma);

        promedio = suma / listanumeros.size();
        System.out.println("El promedio de la lista es: " + promedio);

    }

}
