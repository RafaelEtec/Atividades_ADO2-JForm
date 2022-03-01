package ADO2_Atividades;
import java.util.Scanner;

/** por Rafael Ferreira Goulart
    Dados 3 valores reais (float ou double) imprimir o valor do produto destes valores 
**/

public class Primeira {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o Primeiro valor: ");
        double A = ent.nextDouble();
        System.out.println("Insira o Segundo valor: ");
        double B = ent.nextDouble();
        System.out.println("Insira o Terceiro valor: ");
        double C = ent.nextDouble();
        double res = A*B*C;
        
        System.out.println("O resultado da multiplicação desses valores é : "+res);
    }
}