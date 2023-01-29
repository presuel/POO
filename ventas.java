public class ventas {
    public static void main(String[] args) {
        producto producto1 = new producto("Agua Bonafont 1.2 lt", 13.50, 2);
        producto producto2 = new producto("Agua Bonafont 1.5 lt", 15.00, 1);
        producto producto3 = new producto("CocaCola Light 1.35 lt", 20.80, 2);
        // Listado de productos
        System.out.println("\nLista de productos  \t\t Precio venta \t Cantidad \t Submonto");
        System.out.println("----------------------------------------------------------------------------");
        double montoTotal = 0;
        double submonto = producto1.getPrecio() * producto1.getCantidad();
        montoTotal += submonto;
        System.out.println(
                producto1.getDescripcion() + "\t\t $ " + producto1.getPrecio() + "\t\t " + producto1.getCantidad()
                        + "\t\t $ " + submonto);
        submonto = producto2.getPrecio() * producto2.getCantidad();
        montoTotal += submonto;
        System.out.println(
                producto2.getDescripcion() + "\t\t $ " + producto2.getPrecio() + "\t\t " + producto2.getCantidad()
                        + "\t\t $ " + submonto);
        submonto = producto3.getPrecio() * producto3.getCantidad();
        montoTotal += submonto;
        System.out.println(
                producto3.getDescripcion() + "\t\t $ " + producto3.getPrecio() + "\t\t " + producto3.getCantidad()
                        + "\t\t $ " + submonto);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t Total= $ " + montoTotal);
        System.out.println();
    }
}
