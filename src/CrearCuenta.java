public class CrearCuenta {
    public static void main(String[] args) {

        // Creaion de mi primera cuenta para una persona - Utilizando una clase
        Cuenta  cuentaJuan = new Cuenta();
        cuentaJuan.saldo = 1000;
        cuentaJuan.titular = "Juan";
        cuentaJuan.agencia = 2;
        cuentaJuan.numero = 8;

        // Presentacion de mi Primera Cuenta
        // Cuenta de Juan
        System.out.println("El nombre de la cuenta es " + cuentaJuan.titular);
        
        System.out.println("El saldo que posse actualmente es de " + cuentaJuan.saldo);
        System.out.println("Su numero de agencia es " + cuentaJuan.agencia);
        System.out.println("El numero de su cuenta es " + cuentaJuan.numero);
        System.out.println(" ");
        System.out.println(" ");

        // Creacion de mi segunda Cuenta utilizando una Clase
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 345.56;
        segundaCuenta.titular = "Marcus";
        segundaCuenta.agencia = 4;
        segundaCuenta.numero = 7;

        // Presentacion de mi segunda Cuenta
        // Cuenta de Marcus
        System.out.println("El numero de la cuenta es " + segundaCuenta.titular);
        System.out.println("El saldo que posee actualmente es de " + segundaCuenta.saldo);
        System.out.println("Su numero de agencia es " + segundaCuenta.agencia);
        System.out.println("El numero de su cuenta es " + segundaCuenta.numero);



    }
}
