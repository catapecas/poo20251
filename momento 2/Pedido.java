import java.util.*;

public class Pedido {

    // Atributos

    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    // constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito) {

        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;

    }

    // Metodos
    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] geProducto() {
        return producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

}
