public class Main{
public static void main(String[] args) {
 Almacenes almacen = new Almacenes(100);
 Clientes cliente1 = new Clientes("Pepe");
 Clientes cliente2 = new Clientes("Pepo");
 Clientes cliente3 = new Clientes("Pepi");
 almacen.agregarCliente(cliente1);
 almacen.agregarCliente(cliente2);
 almacen.agregarCliente(cliente3);

 almacen.run();
  

}
}