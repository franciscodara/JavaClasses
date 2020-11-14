//Comando continue.
public class ConditionalStructures6 {
    public static void main(String[] args) {
        /*
        Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        considerando que as parcelas não podem serem menores que 1000.
         */
        double valorCarro = 48000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Em " + parcela + " parcelas, " + "o valor de cada parcela será: R$ " + valorParcela);
        }
    }
}
