/*
Estrutura condicional Switch.
 */
public class ConditionalStructures3 {
    public static void main(String[] args) {
        byte dia = 0;
        // Tipos aceitos em Switch: byte, int, enum, short, char e String.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Opção inválida.");
        }
    }
}
