import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar los valores numéricos
        ArrayList<Integer> numeros = leerValores();
        
        // Calcular la suma de los valores en el ArrayList
        int suma = calcularSuma(numeros);
        
        // Calcular la media aritmética
        double media = (double) suma / numeros.size();
        
        // Mostrar resultados
        mostrarResultados(numeros, suma, media);
    }

    // Método para leer los valores del teclado
    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce números enteros (ingresa -99 para finalizar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero == -99) {
                break;
            }
            numeros.add(numero);
        }
        
        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
        
        return numeros;
    }

    // Método para calcular la suma de los valores en el ArrayList utilizando un Iterator
    public static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        return suma;
    }

    // Método para mostrar los resultados: valores, suma, media, y cuántos son mayores/menores que la media
    public static void mostrarResultados(ArrayList<Integer> numeros, int suma, double media) {
        System.out.println("\nValores ingresados: " + numeros);
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media aritmética: " + media);
        
        int mayores = 0, menores = 0;
        for (int numero : numeros) {
            if (numero > media) {
                mayores++;
            } else if (numero < media) {
                menores++;
            }
        }
        
        System.out.println("Números mayores que la media: " + mayores);
        System.out.println("Números menores que la media: " + menores);
    }
}
