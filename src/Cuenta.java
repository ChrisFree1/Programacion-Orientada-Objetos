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

    // Metodo para depositar

    /*
    En java existen dos tipos de metodos
    - Los que retornan valor
    - Los que no retornan valor (void)
     */
    //  Despositar dinero en mi cuenta - saldo
    void depositar ( double valor){

        this.saldo = this.saldo +  valor;
    }
}