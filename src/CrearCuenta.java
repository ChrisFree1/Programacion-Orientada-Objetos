public class CrearCuenta {
    public static void main(String[] args) {
        // Clase para crear una cuenta para una persona
        Cuenta  cuentaJuan = new Cuenta();
        cuentaJuan.saldo = 1000;
        cuentaJuan.titular = "Juan";
        cuentaJuan.agencia = 2;
        cuentaJuan.numero = 8;

        System.out.println("El nombre de la cuenta es " + cuentaJuan.titular);
        System.out.println("El saldo que posse actualmente es de " + cuentaJuan.saldo);
        System.out.println("Su numero de agencia es " + cuentaJuan.agencia);
        System.out.println("El numero de su cuenta es " + cuentaJuan.numero);

    }
}
