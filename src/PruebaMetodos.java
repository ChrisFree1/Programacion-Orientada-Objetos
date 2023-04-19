public class PruebaMetodos {
    public static void main(String[] args) {
        // Prueba de los metodos

        // Cuenta terceraCUenta = new Cuenta();

        Cuenta cuentaJuan = new Cuenta();
        cuentaJuan.saldo = 300.45;
        cuentaJuan.depositar(200.22);

        System.out.println(cuentaJuan.saldo);


    }
}
