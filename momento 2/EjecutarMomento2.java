
public class EjecutarMomento2 {

  // args es el nombre de una variable, se usa para crear un arreglo de cadenas.
  public static void main(String[] args) {
    Cliente[] cliente = new Cliente[3];
    cliente[0] = new Cliente(66846259, "Nancy Velasquez");
    cliente[1] = new Cliente(1144161396, "Cata Giraldo");
    cliente[2] = new Cliente(1144131678, "karina Ramirez");

    // crea un objeto de la clase cliente.
    Cliente objCliente = new Cliente(66846259, "Nancy velasquez");
    Cliente objCliente1 = new Cliente(1144161396, "Cata Giraldo");
    Cliente objCliente2 = new Cliente(1144131678, "karina Ramirez");

    // arreglo de productos.
    Producto[] producto = new Producto[3];
    producto[0] = new Producto(1, "Nancy Velasquez", 25000, "Fj001", 1.50, 2.0);
    producto[1] = new Producto(2, "Cata Giraldo", 15000, "Mj002", 1.75, 2.5);
    producto[2] = new Producto(3, "karina", 54000, "Ck003", 0.90, 0.50);

    // objeto de la clase producto.
    Producto objProducto = new Producto(0, null, 0, null, 0, 0);
    Producto objProducto1 = new Producto(0, null, 0, null, 0, 0);
    Producto objProducto2 = new Producto(0, null, 0, null, 0, 0);

    // arreglo pedido.
    Pedido[] pedido = new Pedido[3];
    pedido[0] = new Pedido(objCliente2, producto, null, 0);
    pedido[1] = new Pedido(objCliente2, producto, null, 0);
    pedido[2] = new Pedido(objCliente2, producto, null, 0);

    // objeto de clase pedido.
    Pedido objPedido = new Pedido(objCliente, producto, null, 0);
    Pedido objPedido1 = new Pedido(objCliente1, producto, null, 0);
    Pedido objPedido2 = new Pedido(objCliente2, producto, null, 0);

    // arreglo camara.
    Camara[] camara = new Camara[3];
    camara[0] = new Camara(null, null, 0, 0, null, 0, 0, 0, null);
    camara[1] = new Camara(null, null, 0, 0, null, 0, 0, 0, null);
    camara[2] = new Camara(null, null, 0, 0, null, 0, 0, 0, null);

    // objetos clase camara.
    Camara objCamara = new Camara(null, null, 0, 0, null, 0, 0, 0, null);
    Camara objCamara1 = new Camara(null, null, 0, 0, null, 0, 0, 0, null);
    Camara objCamara2 = new Camara(null, null, 0, 0, null, 0, 0, 0, null);

    // arreglo de foto.
    Foto[] foto = new Foto[3];
    foto[0] = new Foto(null, null, null, 0);
    foto[1] = new Foto(null, null, null, 0);
    foto[2] = new Foto(null, null, null, 0);

    // objetos clase foto.
    Foto objFoto = new Foto(null, null, null, 0);
    Foto objFoto1 = new Foto(null, null, null, 0);
    Foto objFoto2 = new Foto(null, null, null, 0);

    // arreglo clase impresion.
    Impresion[] impresion = new Impresion[3];
    impresion[0] = new Impresion(null, foto, 0, 0, null, null, 0, 0);
    impresion[1] = new Impresion(null, foto, 0, 0, null, null, 0, 0);
    impresion[2] = new Impresion(null, foto, 0, 0, null, null, 0, 0);

    // objeto de la clase impresion.
    Impresion objImpresion = new Impresion(null, foto, 0, 0, null, null, 0, 0);
    Impresion objImpresion1 = new Impresion(null, foto, 0, 0, null, null, 0, 0);
    Impresion objImpresion2 = new Impresion(null, foto, 0, 0, null, null, 0, 0);

    // imprimir los pedidos
    for (int i = 0; i < pedido.length; i++) {
      System.out.println("Pedido " + (i + 1) + ":");
      System.out.println("Cliente: " + pedido[i].getCliente());
      System.out.println("Producto: " + pedido[i].geProducto()[0]);
      System.out.println("Fecha: " + pedido[i].getFecha());
      System.out.println("Número de tarjeta de crédito: " + pedido[i].getNumeroTarjetaCredito());
      System.out.println();
    }

    // imprimir los productos.
    // for , se usa para repetir una accion un numero de veces determinado, o
    // estructuras con arreglos.
    for (int i = 0; i < producto.length; i++) {
      System.out.println("Producto:" + (i + 1) + ".");
      System.out.println("Numero:" + producto[i].getNumero());
      System.out.println("Nombre:" + producto[i].getNombre());
      System.out.println("Precio:" + producto[i].getPrecio());
      System.out.println("Referencia:" + producto[i].getReferencia());
      System.out.println("Ancho:" + producto[i].getAncho());
      System.out.println("Alto:" + producto[i].getAlto());
      System.out.println();
    }

    // Imprimir los clientes
    for (int i = 0; i < cliente.length; i++) {
      System.out.println("Cliente " + (i + 1) + ":");
      System.out.println("Nombre: " + cliente[i].getNombre());
      System.out.println("Cedula: " +  cliente[i].getCedula());
      System.out.println();
    }

    // Imprimir las fotos
    for (int i = 0; i < producto.length; i++) {
      if (producto[i] instanceof Impresion) {
        Impresion impresionLocal = (Impresion) producto[i];
        System.out.println("Impresión " + (i + 1) + ":");
        System.out.println("Color: " + impresionLocal.getColor());
        System.out.println("Foto: " + java.util.Arrays.toString(impresionLocal.getFoto()));
        System.out.println();
      }
    }
    // Imprimir las cámaras
    for (int i = 0; i < camara.length; i++) {
      System.out.println("Cámara " + (i + 1) + ":");
      System.out.println("Marca: " + camara[i].getMarca());
      System.out.println("Modelo: " + camara[i].getModelo());
      System.out.println("Código: " + camara[i].getCodigo());
      System.out.println();
    }
    // Imprimir la impresion
    for (int i = 0; i < impresion.length; i++) {
      System.out.println("Impresión " + (i + 1) + ":");
      System.out.println("Color: " + impresion[i].getColor());
      System.out.println("Foto: " + java.util.Arrays.toString(impresion[i].getFoto()));
      System.out.println();
    }

  }
}
