public class ConditionalStructures2 {
    public static void main(String[] args) {
        int idade = 22;
        String status;
//        if (idade < 18) {
//            status = "Menor de idade";
//        } else {
//            status = "Maior de idade";
//        }
        status = idade < 18 ? "Menor de idade" : "Maior de idade";
        System.out.println(status);
    }
}
