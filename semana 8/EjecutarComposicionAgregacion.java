public class EjecutarComposicionAgregacion {

    public static void main(String[] args) {
        
        // creacion de los objetos para validar el modelo.

        Cuenta[] c = new Cuenta[2]; //creacion de una extructura para las cuentas.
        c[0] = new Cuenta(10203456, "Ahorro", 2000.0);
        c[1] = new Cuenta(20250106, "Corriente", 5000.0);

        /*
        Cuenta objCuenta1 = new Cuenta(10203456, "Ahorros", 2000.0 );
        Cuenta objCuenta2 = new Cuenta(20250106, " Corriente", 5000.0);
         */
        

        Cliente objCliente1 = new Cliente( 1011345678, " Byron Cano");
        Cliente objCliente2 = new Cliente( 31789087, "Nathalia hurtado");

        Banco objBanco1 = new Banco( "Bancarrota", "calle 5ta", c );
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));
        

    }
}