public class actividad_1_pg3 {
    public static void main(String[] args) {

        // ? Creamos un objeto de la clase Vehiculo y le asignamos valores a sus atributos
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.marca = "Toyota";
        vehiculo.modelo = "Corolla";
        vehiculo.color = "Rojo";
        vehiculo.año = 2021;
        vehiculo.numPuertas = 4;
        vehiculo.tipoMotor = "Gasolina";
        vehiculo.cilindrada = 1600;
        vehiculo.potencia = 120;

        // ? Llamamos a los métodos de la clase Vehiculo
        vehiculo.encenderMotor();
        vehiculo.acelerar(60);
        vehiculo.frenar(20);
    }
}