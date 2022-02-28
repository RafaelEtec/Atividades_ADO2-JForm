package ADO2_Atividades.Interface;

public class Operacao {
    public String PrimeiraOperacao(int A, int B, int C) { 
        int res = A * B * C;     
        String resp = String.valueOf(res);
        
        return resp;
    }
    
    public String[] SegundaOperacao(int N) {
        int mult = 1;
        int Num1 = N * mult;
        mult++;
        int Num2 = N * mult;
        mult++;
        int Num3 = N * mult;
        mult = 0;
        
        String N1 = String.valueOf(Num1);
        String N2 = String.valueOf(Num2);
        String N3 = String.valueOf(Num3);
        
        return new String[] {N1, N2, N3};
    }
}