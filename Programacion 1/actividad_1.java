
// ! Código incorrecto

// public class ejemplo2141{
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in)
//         “float sue,nsue = 0;”
//         System.out.print("ingrese sueldo: ");
//         sue=teclado.nextFloat();
//         (sue != 1000)
//         if(sue<1000){
//             nsue = (float) (sue * “1.15”);
//             if(sue>1000)
//                 nsue= (float) (sue * 1.12);
//                 System.out.printin("el sueldo final es: "+nsue);
//         }
//         if(sue==1000)
//             System.out.printin("el sueldo final es: "+sue)

// ! Código correcto

import java.util.Scanner; // * Obligatorio para leer datos

public class actividad_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // * Faltó el punto y coma
        float sue, nsue = 0; // * Las comillas dobles no son válidas para declarar variables

        System.out.print("ingrese sueldo: "); 
        sue = teclado.nextFloat();

        // * El if no estaba bien escrito
        if (sue < 1000) {
            nsue = (float) (sue * 1.15); // * Para multiplicar no se usan comillas dobles
        } else if (sue > 1000) {
            nsue = (float) (sue * 1.12);
        } else if (sue == 1000) {
            nsue = sue;
        }
        System.out.println("el sueldo final es: " + nsue); // * El método es println, no printin

        teclado.close(); // * Cierra el teclado para evitar errores
    } // ? Faltó cerrar el método main
} // ? Faltó cerrar la clase
