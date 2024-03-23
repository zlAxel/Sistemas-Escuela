public class actividad_1_2_pg3 {
    public static void main(String[] args) {
        // ? Creamos un objeto de la clase Impresora y le asignamos valores a sus atributos
        Impresora impresora = new Impresora();
        impresora.marca = "HP";
        impresora.modelo = "LaserJet Pro M15w";
        impresora.tipoImpresion = "Láser";
        impresora.velocidadImpresion = 18;
        impresora.resolucion = "600 x 600 dpi";
        impresora.conectividad = "Wi-Fi";
        impresora.tamañoPapel = "A4";
        impresora.capacidadBandejaEntrada = 150;
        impresora.capacidadBandejaSalida = 100;

        // ? Llamamos a los métodos de la clase Impresora
        impresora.encender();
        impresora.imprimir("Documento de prueba");
        impresora.apagar();
    }
}