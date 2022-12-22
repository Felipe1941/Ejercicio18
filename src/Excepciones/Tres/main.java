package Excepciones.Tres;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader archivoNoEncontrado = new FileReader("archivo.txt");
            System.out.println(archivoNoEncontrado);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
