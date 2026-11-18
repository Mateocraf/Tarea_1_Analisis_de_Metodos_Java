import java.util.Scanner;

public class T1_C4_Herrera {
    static int contarDigitos(int n) {
        int cantidad = 0;
        do {
            cantidad++;
            n = n / 10;
        } while (n > 0);
        return cantidad;
    }

    static long potencia(int b, int e) {
        long resultado = 1;
        for (int i = 0; i < e; i++) {
            resultado = resultado * b;
        }
        return resultado;
    }

    static boolean esArmstrong(int n) {
        if (n < 0) {
            return false;
        }

        int cantidad = contarDigitos(n);
        int restante = n;
        long suma = 0;
        do {
            int digito = restante % 10;
            suma = suma + potencia(digito, cantidad);
            restante = restante / 10;
        } while (restante > 0);

        return suma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int n = sc.nextInt();
        if (esArmstrong(n)) {
            System.out.println(n + " es Armstrong.");
        } else {
            System.out.println(n + " no es Armstrong.");
        }
        sc.close();
    }
}
