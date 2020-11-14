/*
Crie uma variável salário, calcule o imposto sobre o salário e imprima:
Salário, imposto e salário - imposto.
Taxas de impostos:
Se salário < 1000, imposto de 5%;
Se salário > 1000 e < 2000, imposto de 10%;
Se salário > 2000 e < 4000, imposto de 15%;
Se salário > 4000 imposto de 20%;
Observação: A estrutura condicional if, quando atendida, ignora todas as condições else if
seguintes. É possível encadear várias condições if e sequencia em casos específicos.
 */

public class Exercice003 {
    public static void main(String[] args) {
        double salario = 900;
        double totalImposto ;
        double salarioLiquido ;
        if (salario < 1000) {
            totalImposto = salario * 0.05;
            salarioLiquido = salario - totalImposto;
        } else if (salario >= 1000 && salario < 2000){
            totalImposto = salario * 0.10;
            salarioLiquido = salario - totalImposto;
        } else if (salario >= 2000 && salario <4000){
            totalImposto = salario * 0.15;
            salarioLiquido = salario - totalImposto;
        } else {
            totalImposto = salario * 0.20;
            salarioLiquido = salario - totalImposto;
        }
        System.out.println("O salário bruto é: " + salario);
        System.out.println("O total do imposto é: " + totalImposto);
        System.out.println("O total do imposto é: " + salarioLiquido);
    }
}
