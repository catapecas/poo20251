import java.util.*;

public class Pedido {

    // Atributos

    private Cliente cliente;
    private Producto[] Producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    // constructor
    public Pedido (Cliente cliente, producto[] producto, Date fecha, int numeroTarjetaCredito ){

     this.cliente = cliente;
     this.Producto = producto;
     this.fecha = fecha;
     this.numeroTarjetaCredito = numeroTarjetaCredito;

    }

    //Metodos
    public Cliente getCliente(){
        return cliente;
    }


    
}
