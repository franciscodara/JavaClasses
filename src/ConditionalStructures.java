public class ConditionalStructures {
    public static void main(String[] args) {
        //  Se idade < que 15, categoria infantil
        //  Se idade >= 15 e < que 18, categoria juvenil
        //  Se idade >= 18, categoria adulto.
        int idade = 14;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
