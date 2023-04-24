public class AtencionClienteBanco {

    public static void main(String[] args) {

        //Ingreso de mi cuenta Bancaria
        CuentaBancaria primerCliente = new CuentaBancaria();
        primerCliente.saldo=100.00;
        primerCliente.titularCuenta="Pedro";
        primerCliente.empleado = "Jose";
        primerCliente.sucursal=2;

        // Ingreso de Deposito
        //primerCliente.depositar(56.00);
        //primerCliente.depositar(100.00);

        // Consulta de su saldo
        primerCliente.consultaSaldo(primerCliente.saldo);

        // Retiro de dinero del saldo de la cuenta del usuario
        primerCliente.retiroDinero(23.00);


        primerCliente.consultaEstadoSaldo(primerCliente.titularCuenta,primerCliente.saldo);



    }
}
