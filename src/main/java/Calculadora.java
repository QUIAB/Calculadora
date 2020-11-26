import java.util.Scanner;

public class Calculadora {
    int numero1 = 0;
    int numero2 = 0;
    //Creacion del scanner para leer los numeros.
    Scanner sc = new Scanner(System.in);

    public void Calculadora(){
        //preguntar que operacion desea hacer
        System.out.println("¿Qué operación desea hacer?");
        System.out.println("Suma: 1\nResta: 2\nMutiplicación: 3\nDivisión: 4\nPotencia: 5");
        int operacion = sc.nextInt();

        //Segun el numero introducido es la operacion que se realizara
        switch (operacion)
        {
            case 1:
                System.out.println("Sumando");
                this.suma();
                break;
            case 2:
                System.out.println("Restando");
                this.resta();
                break;
            case 3:
                System.out.println("Multiplicando");
                this.multiplicación();
                break;
            case 4:
                System.out.println("Dividiendo");
                this.potencia();
                break;
            case 5:
                System.out.println("Potencia");
                break;
            default:
                System.out.println("No es una operación correcta");
        }
    }

    public int suma(){
        System.out.println("Ingresa el primer numero");
        numero1= sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        numero2= sc.nextInt();
        return numero1+numero2;
    }

    public int resta(){
        System.out.println("Ingresa el minuendo");
        numero1= sc.nextInt();
        System.out.println("Ingresa el sustraendo");
        numero2= sc.nextInt();
        return numero1-2;
    }

    public int multiplicación(){
        System.out.println("Ingresa el primer factor");
        numero1= sc.nextInt();
        System.out.println("Ingresa el segundo factor");
        numero2= sc.nextInt();
        return numero1*numero2;
    }

    public int division() {
        System.out.println("Ingresa el dividendo");
        numero1= sc.nextInt();
        System.out.println("Ingresa el divisor");
        numero2= sc.nextInt();
        return numero1/numero2;
    }

    public int potencia(){
        System.out.println("Ingresa la base");
        numero1= sc.nextInt();
        System.out.println("Ingresa el exponente");
        numero2= sc.nextInt();
        return (int) Math.pow(numero1,numero2);
    }
}
