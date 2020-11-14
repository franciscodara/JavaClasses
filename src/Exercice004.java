/*
Dados os valores de 1 à 7, imprima se é dia útil ou fim de semana.
 */
public class Exercice004 {
    public static void main(String[] args) {
        byte dia = 9;
        // Tipos aceitos em Switch: byte, int, enum, short, char e String.
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia últil.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
