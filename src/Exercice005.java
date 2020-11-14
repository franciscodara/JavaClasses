// Imprima todos os números pares de 0 à 100 mil.
public class Exercice005 {
    public static void main(String[] args) {
        int par = 100000;
        for (int i = 0; i <= par; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
