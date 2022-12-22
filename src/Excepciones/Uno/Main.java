package Excepciones.Uno;

public class Main {
    public static void main(String[] args) {
        try{
            int valor1 = 5;
            int valor2 =0 ;
            int resultado= valor1 / valor2;
            System.out.println(resultado);

        }catch (ArithmeticException e){
            System.out.println("No se puede dividir en 0");
        }
    }
}
