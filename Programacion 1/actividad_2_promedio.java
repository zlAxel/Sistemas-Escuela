
/**
 * Desarrollar un programa en Java que te permita calcular el promedio final para un alumno el cual 
 * tiene 5 materias diferentes, el pase es de 7. Deberás imprimir el nombre de alumno, las calificaciones, 
 * el promedio final y si el promedio final es mayor o igual a 7 imprimir aprobado y si es un caso 
 * contrario imprimir reprobado.
 */

public class actividad_2_promedio {
    public static void main(String[] args) {
        // ? Declaración de variables
        float calif_1, calif_2, calif_3, calif_4, calif_5, promedio;
        String nombre = "Axel";

        // ? Asignación de variables
        calif_1 = 9;
        calif_2 = 9;
        calif_3 = 6;
        calif_4 = 10;
        calif_5 = 8;

        // ? Cálculo del promedio
        promedio = (calif_1 + calif_2 + calif_3 + calif_4 + calif_5) / 5;

        // ? Imprimir datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificaciones: " + calif_1 + ", " + calif_2 + ", " + calif_3 + ", " + calif_4 + ", " + calif_5);
        System.out.println("Promedio: " + promedio);

        // ? Imprimir si aprobó o reprobó
        if (promedio >= 7) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Reprobado.");
        }
    }
}
