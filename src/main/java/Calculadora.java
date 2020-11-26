import java.util.Scanner;

public class Calculadora {
    int numero1 = 0;
    int numero2 = 0;

    public void Calculadora(){
        System.out.println("Calculadora funcionando");
    }

    public int suma(int a,int b){
        numero1 = a;
        numero2 = b;
        return numero1+numero2;
    }

    public int resta(int a,int b){
        numero1 = a;
        numero2 = b;
        return numero1-numero2;
    }

    public int multiplicación(int a,int b){
        numero1 = a;
        numero2 = b;
        return numero1*numero2;
    }

    public int division(int a,int b) {
        numero1 = a;
        numero2 = b;
        return numero1/numero2;
    }

    public int potencia(int a,int b){
        numero1 = a;
        numero2 = b;
        return (int) Math.pow(numero1,numero2);
    }
}
