/**
 * Generaremos un ejemplo de try catch para el manejo de excepciones.
 * 
 * Tipos de excepciones a considerar:

    ArithmeticException: Se lanza cuando una condición aritmética ocurre, por ejemplo, la división entre cero.
    ClassCastException: Se lanza para indicar que el código ha intentado convertir un objeto en una subclase de la que no es una instancia.
    NumberFormatException: Se lanza para indicar que la aplicación ha intentado convertir una cadena de texto a uno de los tipos numéricos.
    IndexOutOfBoundException: Se lanza para indicar que un índice de algún tipo (como un conjunto, una cadena o un vector) está fuera de rango.

*/

public class actividadad_2_pg3 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Resultado: " + c);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

        // ClassCastException
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;

            // Usamos "s" para que no se muestre un warning
            System.out.println("Resultado: " + s);
        } catch (ClassCastException e) {
            System.out.println("No se puede convertir un objeto en una subclase de la que no es una instancia.");
        }

        // NumberFormatException
        try {
            String s = "abc";
            int i = Integer.parseInt(s);

            // Usamos "i" para que no se muestre un warning
            System.out.println("Resultado: " + i);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir una cadena de texto a uno de los tipos numéricos.");
        }

        // IndexOutOfBoundException
        try {
            int a[] = new int[5];
            a[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Un índice de algún tipo está fuera de rango.");
        }
    }
}