public class consultas {
    public static void main(String[] args) {
        persona persona1 = new persona("Andrea", "Presuel", 18);
        persona1.setEstatura(1.75);
        persona1.setPeso(57);
        System.out.print("Persona 1\n");
        System.out.println(persona1.getNombres() + " " + persona1.getApellidos());
        System.out.println("edad: " + persona1.getEdad() + " , altura: " + persona1.getEstatura() +
                " m. , peso: " + persona1.getPeso() + " kg.\n");
        persona persona2 = new persona("Aurora", "Presuel", 18, 1.77, 60);
        System.out.print("Persona 2\n");
        System.out.println(persona2.getNombres() + " " + persona2.getApellidos());
        System.out.println("edad: " + persona2.getEdad() + " , altura: " + persona2.getEstatura() +
                " m. , peso: " + persona2.getPeso() + " kg.\n");
    }
}
