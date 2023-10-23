
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
        String str = "", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

        //Ver si el numero es mi hermano

        //Ver cuantas mayus tiene el grillete

        //Si no es ja primo factorizarlo chacho


        //Mostrar el tamaño de la cadena perpetua



    }
}