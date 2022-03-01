package ADO2_Atividades;
import java.util.Scanner;

/** por Rafael Ferreira Goulart
    Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste valor 
**/

public class Segunda {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira um valor: ");
        int N = ent.nextInt();
        int mult = 1;
        
        while (mult <= 3) {
            int res = N * mult;
            System.out.println("O múltiplo de "+N+" por "+mult+" é: "+res);
            mult++;
        }
    }
}