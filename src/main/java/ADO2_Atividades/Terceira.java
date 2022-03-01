package ADO2_Atividades;
import java.util.Scanner;

/** por Rafael Ferreira Goulart
    Dado um valor inteiro de 1 até 10, imprimir a “tabela” da tabuada deste valor
**/

public class Terceira {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira um valor que seja:\n"
                + "|    > 0    |\n"
                + "|     e     |\n"
                + "|    < 11   |");
                
        int N = ent.nextInt(); 
        
        while (N <= 0 || N > 10) {
            System.out.println("O valor deve ser maior que 0 ou menor/igual a 10!\n"
                    + "Insira o valor novamente: ");
            N = ent.nextInt();
        }
        
        System.out.println("\nTabuada do número "+N+": \n");
        int mult = 1;
        
        while (mult <= 10) {
            int res = N * mult;
            System.out.println(N+"x"+mult+" = "+res);
            mult++;
        }
    }
}