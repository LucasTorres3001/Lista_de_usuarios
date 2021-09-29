package classe.acessorio;



public class Acessoria {
    
    public static byte idade(short a, int A){
        return (byte) (a - A);
    }
    
    public static double imc(double a, float A){
        return (a / (A * A));
    }
    
    public static String statusIdade(byte a){
        
        String msg = "";
        
        if(a < 18){
            msg += "Usuário(a) é menor de idade!";
        }
        else{
            if(a >= 18){
                msg += "Usuário(a) é maior de idade!";
            }
        }
        
        return msg;
    }
    
    public static String statusIMC(double a){
        
        String msg = "";
        
        if(a < 18){
            msg += "Usuário(a) está ABAIXO DO PESO!";
        }
        else if(a >= 18 && a < 25){
            msg += "Usuário(a) está com o PESO NORMAL!";
        }
        else if(a >= 25 && a < 30){
            msg += "Usuário(a) está com SOBREPESO!";
        }
        else if(a >= 30 && a < 35){
            msg += "Usuário(a) está com OBESIDADE GRAU 1";
        }
        else if(a >= 35 && a < 40){
            msg += "Usuário(a) está com OBESIDADE GRAU 2";
        }
        else{
            if(a >= 40){
                msg += "Usuário(a) está com OBESIDADE GRAU 3";
            }
        }
        
        return msg;
    }
}
