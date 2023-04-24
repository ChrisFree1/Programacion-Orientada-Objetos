class CuentaBancaria {
    int sucursal;
    String empleado;
    String titularCuenta;
    double saldo;


    // Metodo para depositar en la cuenta del titular
    public void depositar(double valor){
        System.out.printf("Deposito exitoso!"); // Mensaje que indica el deposito realizado
        this.saldo = this.saldo + valor;
    }

    public void consultaSaldo(double valor ){

        System.out.println("Estimado cliente su saldo es de $" + valor);
    }


    public  boolean retiroDinero(double valor){

        if (this.saldo >= valor){
            System.out.println("El reitro fue realizado con exito!");
            this.saldo = this.saldo - valor;
            return true;
        }else {
            System.out.println("El valor que quiere retirar es mayor a que tiene en la cuenta!");
            return false;
        }
    }

    public void consultaEstadoSaldo(String nombre, double valor){
        System.out.println("Estimado Cliente " + nombre + "el estado de su cuenta es de $" + valor);
    }
}
