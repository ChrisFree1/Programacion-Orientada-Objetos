class Personas {
      String nombre;
      double dinero = 00.00;



      // Metodo para ingresar dinero en la cuenta del usario
      void ingresoDinero(double saldo ){

            this.dinero =  this.dinero +  saldo;
      }

      // Metodo para consultar el estado del saldo del cliente
      void consultaDinero(String nombre, double dinero){
            System.out.println("Estimado " + nombre + "su saldo es de " + dinero);
      }

}
