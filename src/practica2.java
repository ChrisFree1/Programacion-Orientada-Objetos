public class practica2 {

    public static void main(String[] args) {
        // Pracita de mis clases en java

        Personas persona1 = new Personas(); // Creo una instancia de mi clase Personas

        persona1.nombre = "Juan"; // Le asigno un nombre

        persona1.dinero= 6; // Le asigno un monto de dinero

        persona1.dinero = 9;

        persona1.ingresoDinero(persona1.dinero); // Llamo a mi metodo para ingresar dinero a la cuenta del usuario

        persona1.consultaDinero(persona1.nombre, persona1.dinero); // Llamo a mi metodo para consultar el saldo del cliente


    }
}
