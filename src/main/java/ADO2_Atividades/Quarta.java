package ADO2_Atividades;
import java.util.Scanner;

/** por Rafael Ferreira Goulart
    Dado um nome (String), imprimir a quantidade de caracteres deste nome
**/

public class Quarta {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira um Nome: ");
        String nome = ent.next();
        
        System.out.println("O nome "+nome+" possui "+nome.length()+" caracteres");
    }
}