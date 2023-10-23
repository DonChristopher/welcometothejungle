
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce un super numero broooo:");
        int numero=scanner.nextInt();

        System.out.println("Introduce una super cadena:");



        //con el scanner cogeis un numero entero positivo y una cadena


        //Ver si el string es palomo

        //Ver si el numero es mi hermano
        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;


        //Ver cuantas mayus tiene el grillete

        //Si no es ja primo factorizarlo chacho


        //Mostrar el tamaño de la cadena perpetua



    }
}