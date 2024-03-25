import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la primera fecha
        System.out.println("Ingrese primera resistencia:");
        double res1 = scanner.nextDouble();

        // Solicitar al usuario la segunda fecha
        System.out.println("Ingrese segunda resistencia:");
        double res2 = scanner.nextDouble();

        // Solicitar al usuario la segunda fecha
        System.out.println("Ingrese tercera resistencia:");
        double res3 = scanner.nextDouble();

        double rt = (1 /(1/res1) + (1/res2) + (1/res3)); // calculamos la resistencia total

        System.out.printf("La resistencia total es de %.1f%n", rt); // la función %.1f% me permite elegir cuántos decimales voy a mostrar.
    }
}

