public class actividad_2 {
    public static void main(String[] args) {
        // ? Declaración de variables
        int edad = 12;          // * Declaración de variable.
        double precio = 19.99;  // * Declaración con valor inicial.
        String nombre = "Juan"; // * Declaración de una cadena con valor inicial.

        // ? Imprimir en consola las variables
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("Nombre: " + nombre);

        /**
         * En Java, las variables de referencia se utilizan para hacer referencia a objetos en lugar de almacenar 
         * directamente los valores. Estas variables almacenan direcciones de memoria de objetos, lo que significa 
         * que apuntan a la ubicación donde se encuentra el objeto en memoria. Las características y operaciones 
         * clave de las variables de referencia incluyen:
         */

        // ? Declaración de variables de referencia
        Persona persona;         // * Declaración de la variable "persona" de tipo "Persona."
        Persona otraPersona;

        // ? Creación de objetos
        persona = new Persona(); // * Creación del objeto "persona" de la clase "Persona."

        // ? Acceso a miembros de objetos
        persona.nombre = "Axel"; // * Acceso al atributo "nombre" del objeto "persona."
        persona.saludar();       // * Invocación del método "saludar" del objeto "persona."

        // ? Asignación de variables de referencia
        otraPersona = new Persona();
        otraPersona.nombre = "Juan";

        // ? Comparación de variables de referencia
        if (persona == otraPersona) {
            System.out.println("Las variables de referencia son iguales.");
        } else {
            System.out.println("Las variables de referencia son diferentes.");
        }
    }
}
