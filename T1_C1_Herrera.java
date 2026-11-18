import java.util.Locale;
import java.util.Scanner;

public class T1_C1_Herrera {
    static double leerConsumo(Scanner sc) {
        while (true) {
            System.out.print("Consumo en m3: ");
            if (sc.hasNextDouble()) {
                double m3 = sc.nextDouble();
                if (m3 >= 0 && m3 < Double.POSITIVE_INFINITY) {
                    return m3;
                }
            } else {
                sc.next();
            }
            System.out.println("Ingrese un consumo numerico mayor o igual a cero.");
        }
    }

    static double calcularValor(double m3) {
        if (m3 <= 15) {
            return 2.50 + m3 * 0.40;
        }
        return 2.50 + 15 * 0.40 + (m3 - 15) * 0.75;
    }

    static void mostrarPlanilla(double m3, double valor) {
        System.out.printf("Consumo registrado: %.2f m3%n", m3);
        System.out.printf("Total a pagar: $%.2f%n", valor);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double m3 = leerConsumo(sc);
        double valor = calcularValor(m3);
        mostrarPlanilla(m3, valor);
        sc.close();
    }
}