import java.util.Locale;
import java.util.Scanner;

public class T1_C3_Herrera {
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    static double volumen(double largo, double ancho, double altura) {
        return largo * ancho * altura;
    }

    static void mostrarMenu() {
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Lado: ");
                    double lado = sc.nextDouble();
                    System.out.printf("Volumen: %.2f u3%n", volumen(lado));
                    break;
                case 2:
                    System.out.print("Radio y altura: ");
                    double radio = sc.nextDouble();
                    double alturaCilindro = sc.nextDouble();
                    System.out.printf("Volumen: %.2f u3%n",
                            volumen(radio, alturaCilindro));
                    break;
                case 3:
                    System.out.print("Largo, ancho y altura: ");
                    double largo = sc.nextDouble();
                    double ancho = sc.nextDouble();
                    double alturaPrisma = sc.nextDouble();
                    System.out.printf("Volumen: %.2f u3%n",
                            volumen(largo, ancho, alturaPrisma));
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}