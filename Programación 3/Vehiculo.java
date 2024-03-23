public class Vehiculo {
    // ? Atributos
    String marca;
    String modelo;
    String color;
    Integer año;
    Integer numPuertas;
    String tipoMotor;
    Integer cilindrada;
    Integer potencia;

    // ? Métodos
    public void encenderMotor() {
        System.out.println("El motor del vehículo ha sido encendido.");
    }

    public void acelerar(Integer velocidad) {
        System.out.println("El vehículo ha acelerado a " + velocidad + " km/h.");
    }

    public void frenar(Integer velocidad) {
        System.out.println("El vehículo ha frenado a " + velocidad + " km/h.");
    }
}