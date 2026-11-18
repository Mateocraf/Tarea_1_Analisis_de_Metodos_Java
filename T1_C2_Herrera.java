import java.util.Locale;
import java.util.Scanner;

public class T1_C2_Herrera {
    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        }
        if (nota >= 9) {
            return "Supletorio";
        }
        return "Reprobado";
    }

    static double necesitaEnSupletorio(double nota) {
        return 28 - nota;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres notas sobre 20:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double nota = promedio(a, b, c);
        System.out.printf("Promedio: %.2f%n", nota);
        System.out.println("Estado: " + estado(nota));
        if (nota >= 9 && nota < 14) {
            double minima = necesitaEnSupletorio(nota);
            System.out.printf("Nota minima en el supletorio: %.2f%n", minima);
        }
        sc.close();
    }
}
