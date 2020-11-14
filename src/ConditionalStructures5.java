//Comando break.
public class ConditionalStructures5 {
    public static void main(String[] args) {
        /*
        Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        considerando que as parcelas não podem serem menores que 1000.
         */
        double valorCarro = 48000;
        /*double parcelas = valorCarro / 2000;
        System.out.println(parcelas);*/
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
        /*    if (valorParcela >= 1000) {
                System.out.println("Em " + parcela + " parcelas, " + "o valor de cada parcela será: R$ " + valorParcela);
            } else {
                System.out.println("Saindo do laço");
                break;
            }*/
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Em " + parcela + " parcelas, " + "o valor de cada parcela será: R$ " + valorParcela);
        }
    }
}
