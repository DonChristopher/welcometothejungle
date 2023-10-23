
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce un super numero broooo:");
        int numero=scanner.nextInt();

        System.out.println("Introduce una super cadena:");
        String cadena=scanner.nextLine();



        //con el scanner cogeis un numero entero positivo y una cadena


        //Ver si el string es palomo

        //Ver si el numero es mi hermano

        //Ver cuantas mayus tiene el grillete
        char car;
        int count=0;
        if (cadena.isEmpty()) {
            cadena = scanner.nextLine();
        }
        for (int i = 0; i < cadena.length(); i++) {
            car = cadena.charAt(i);
            if (car == 'A' || car == 'B' || car == 'C' || car == 'D' || car == 'E' || car == 'F' || car == 'G' ||
                    car == 'H' || car == 'I' || car == 'J' || car == 'K' || car == 'L' || car == 'M' || car == 'N' ||
                    car == 'Ñ' || car == 'O' || car == 'P' || car == 'Q' || car == 'R' || car == 'S' || car == 'T' ||
                    car == 'U' || car == 'V' || car == 'W' || car == 'X' || car == 'Y' || car == 'Z') {
                count++;
            }
        }
        System.out.println("En esa cadena hay " + count + " mayúsculas.");



        //Si no es ja primo factorizarlo chacho


        //Mostrar el tamaño de la cadena perpetua



    }
}