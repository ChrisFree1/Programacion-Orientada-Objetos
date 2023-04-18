public class venderParabrisas {
    public static void main(String[] args) {
        // Clase para vender un parabrisas
        Parabrisas primeraVenta = new Parabrisas();
        primeraVenta.anio = 1990;
        primeraVenta.calidad = "Templado";
        primeraVenta.posicion = "Delantero";
        primeraVenta.precio = 23.40;

        // Presentacion de la venta de parabrisas
        System.out.println("SU DETALLE FACTURA ES EL SIQUIENTE: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("El año del parabrisas es del " + primeraVenta.anio);
        System.out.println("La calidad del parabrisas es " + primeraVenta.calidad);
        System.out.println("La posicion del parabrisas es " + primeraVenta.posicion);
        System.out.println("El precio del parabrisas es de " + primeraVenta.precio);

    }
}
