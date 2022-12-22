package Excepciones.Dos;

public class main {
    public static void main(String[] args) {
        try {
            String[] names = {"nombre 1", "nombre 2", "nombre 3", "nombre 4", "nombre 5", "nombre 6"};
            for (int i = 0; i <= names.length; i++) {
                System.out.println(names[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hay un error");
        }
    }
}

