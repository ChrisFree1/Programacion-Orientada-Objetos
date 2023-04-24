class Cuenta{
    /*
        Atributos para esta clase son:
        - Saldo
        - Agencia
        - Numero
        - Titular
     */
    double saldo;
    int agencia;
    int numero;
    String titular;


    // Creacion de mis metodos


    /*
    En java existen dos tipos de metodos
    - Los que retornan valor
    - Los que no retornan valor (void)
     */

    //  Metodo para depositar dinero
    public void depositar ( double valor){

        this.saldo = this.saldo +  valor;
    }



    // Metodo para retirar dinero
    public boolean retirar (double valor ){

        if ( this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }


    public void consultaCuentaDespuesRetiro(String nombre, double valor){
        System.out.println("Estimado cliente " + nombre + " el valor de su cuenta luego del retiro es de " + valor);


    }


    public void consultarCuentaDespuesDeposito(String nombre, double valor){
        System.out.println("Estimado Cliente " + nombre + "su valor de la cuenta luego del deposito es de: " + valor);
    }



}