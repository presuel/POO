public class ventas {
    public static void main(String[] args) {
        producto producto1 = new producto("Agua Bonafont 1.2 lt", 13.50, 12);
        producto producto2 = new producto("Agua Bonafont 1.5 lt", 15.00, 12);
        producto producto3 = new producto("CocaCola Light 1.35 lt", 20.80, 12);
        // Productos existentes
        System.out.println("\nProductos existentes \t\t Precio venta \t Cantidad");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(
                producto1.getDescripcion() + "\t\t $ " + producto1.getPrecio() + "\t\t " + producto1.getCantidad());
        System.out.println(
                producto2.getDescripcion() + "\t\t $ " + producto2.getPrecio() + "\t\t " + producto2.getCantidad());
        System.out.println(
                producto3.getDescripcion() + "\t\t $ " + producto3.getPrecio() + "\t\t " + producto3.getCantidad());
        System.out.println("----------------------------------------------------------------------------\n\n");

        // Listado de productos
        System.out.println("\nLista de productos  \t\t Precio venta \t Cantidad \t Submonto");
        System.out.println("----------------------------------------------------------------------------");
        double montoTotal = 0;
        int cantidadVendida = 3; // Se venden 3 piezas de producto1
        producto1.Venta(cantidadVendida);
        double submonto = producto1.getPrecio() * cantidadVendida;
        montoTotal += submonto;
        System.out.println(producto1.getDescripcion() + "\t\t $ " + producto1.getPrecio() + "\t\t " + cantidadVendida
                + "\t\t $ " + submonto);
        cantidadVendida = 1; // Se vende 1 pieza de producto2
        producto2.Venta(cantidadVendida);
        submonto = producto2.getPrecio() * cantidadVendida;
        montoTotal += submonto;
        System.out.println(producto2.getDescripcion() + "\t\t $ " + producto2.getPrecio() + "\t\t " + cantidadVendida
                + "\t\t $ " + submonto);
        cantidadVendida = 5; // Se venden 5 piezas de producto3
        producto3.Venta(cantidadVendida);
        submonto = producto3.getPrecio() * cantidadVendida;
        montoTotal += submonto;
        System.out.println(producto3.getDescripcion() + "\t\t $ " + producto3.getPrecio() + "\t\t " + cantidadVendida
                + "\t\t $ " + submonto);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t Total= $ " + montoTotal);
        System.out.println();

        // Productos existentes
        System.out.println("\nProductos existentes \t\t Precio venta \t Cantidad");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(
                producto1.getDescripcion() + "\t\t $ " + producto1.getPrecio() + "\t\t " + producto1.getCantidad());
        System.out.println(
                producto2.getDescripcion() + "\t\t $ " + producto2.getPrecio() + "\t\t " + producto2.getCantidad());
        System.out.println(
                producto3.getDescripcion() + "\t\t $ " + producto3.getPrecio() + "\t\t " + producto3.getCantidad());
        System.out.println("----------------------------------------------------------------------------\n\n");
    }
}
