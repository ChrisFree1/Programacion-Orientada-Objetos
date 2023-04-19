public class presentacionPersonas {
    public static void main(String[] args) {
        // Creacion de personas
        Persona personaUno = new Persona();
        personaUno.edad= 23;
        personaUno.color= "Blanco";
        personaUno.nombre="Juan";
        personaUno.raza="Española";


        // Presentacion de las personas
        System.out.println("Su nombre es: " + personaUno.nombre);
        System.out.println("Su edad es: " + personaUno.edad);
        System.out.println("Su raza es: " + personaUno.raza);
        System.out.println("Su color es: " + personaUno.color);
    }
}
