package recursividad;

public class Recursividad {
    public static void main(String[] args) {
        int base = 5;
        int exponente = 3;
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia(base, exponente));
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return multiplicar(base, potencia(base, exponente - 1));
        }
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicar(a, b - 1);
        }
    }
}
