public class Impresora {
    // ? Atributos
    String marca;
    String modelo;
    String tipoImpresion;
    Integer velocidadImpresion;
    String resolucion;
    String conectividad;
    String tamañoPapel;
    Integer capacidadBandejaEntrada;
    Integer capacidadBandejaSalida;

    // ? Métodos
    public void encender() {
        System.out.println("La impresora ha sido encendida.");
    }

    public void imprimir(String documento) {
        System.out.println("La impresora ha impreso el documento: " + documento);
    }

    public void apagar() {
        System.out.println("La impresora ha sido apagada.");
    }
}
