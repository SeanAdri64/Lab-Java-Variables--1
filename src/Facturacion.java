import java.util.Scanner;
public class Facturacion {
    //Crea un nuevo archivo Facturacion.java.
    public static void main(String[] args) {
        // 1. Declara variables con nombres apropiados para:
        String nombreProducto;
        double precioProducto;
        int cantidad;
        final double IMPUESTO = 0.21;
        double dineroCliente;
        Scanner sc = new Scanner(System.in);
        // 2. Entrada de Datos : Usa Scanner para pedir al usuario el nombre, precio, cantidad y cuánto dinero trae
        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = sc.nextDouble();
        System.out.print("Ingrese la cantidad que desea comprar: ");
        cantidad = sc.nextInt();
        System.out.print("Ingrese cuánto dinero trae el cliente: ");
        dineroCliente = sc.nextDouble();
        // 3. Lógica de Negocio
        //Calcula el subtotal (precio * cantidad)
        double subtotal = precioProducto * cantidad;
        //Calcula el totalAPagar sumando el impuesto al subtotal.
        double totalAPagar = subtotal + (subtotal * IMPUESTO);
        /* Reto de Casting: La tienda tiene una promoción donde no cobra centavos. Crea
        una nueva variable totalRedondeado (int) haciendo casting explícito del total*/
        int totalRedondeado = (int) totalAPagar;
        /* 4. Validación:Crea una variable booleana puedeComprar que compare si el dineroCliente es
        mayor o igual al totalAPagar*/
        boolean puedeComprar = dineroCliente >= totalAPagar;
        /* 5. Salida: Imprime un ticket ordenado con todos los datos y el mensaje:
        "¿Compra aprobada?: true/false"*/
        System.out.println("\n------------ TICKET DE COMPRA ------------");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: $" + precioProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (21%): $" + (subtotal * IMPUESTO));
        System.out.println("Total a pagar: $" + totalAPagar);
        System.out.println("Total redondeado (promoción): $" + totalRedondeado);
        System.out.println("Dinero del cliente: $" + dineroCliente);
        System.out.println("--------------------------------------");
        System.out.println("¿Compra aprobada?: " + puedeComprar);
        System.out.println("------------");
    }
}
