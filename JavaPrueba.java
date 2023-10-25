import java.util.Scanner;

public class JavaPrueba {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print ("Introduzca el primer numero entero: ");
        int num1 = Integer.parseInt (sc.nextLine());
        System.out.print ("Introduzca el segundo numero entero: ");
        int num2 = Integer.parseInt (sc.nextLine());

        System.out.print ("La suma de los dos enteros es: " + (num1 + num2));

    }
}