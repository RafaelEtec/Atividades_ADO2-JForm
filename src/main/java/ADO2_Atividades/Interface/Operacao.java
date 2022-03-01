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
    
    public String[] TerceiraOperacao(int N) {
        int mult = 1;
        int Num1 = N * mult;
        mult++;
        int Num2 = N * mult;
        mult++;
        int Num3 = N * mult;
        mult++;
        int Num4 = N * mult;
        mult++;
        int Num5 = N * mult;
        mult++;
        int Num6 = N * mult;
        mult++;
        int Num7 = N * mult;
        mult++;
        int Num8 = N * mult;
        mult++;
        int Num9 = N * mult;
        mult++;
        int Num10 = N * mult;
        mult++;
        
        String N1 = String.valueOf(Num1);
        String N2 = String.valueOf(Num2);
        String N3 = String.valueOf(Num3);
        String N4 = String.valueOf(Num4);
        String N5 = String.valueOf(Num5);
        String N6 = String.valueOf(Num6);
        String N7 = String.valueOf(Num7);
        String N8 = String.valueOf(Num8);
        String N9 = String.valueOf(Num9);
        String N10 = String.valueOf(Num10);
        
        return new String[] {N1, N2, N3, N4, N5, N6, N7, N8, N9, N10};
    }
    
    public String QuartaOperacao(String Nome) {
        int chars = Nome.length();
        String quant = String.valueOf(chars);
        return quant;
    }
}