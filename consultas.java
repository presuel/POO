public class consultas {
    public static void main(String[] args) {
        persona persona1 = new persona("Andrea", "Presuel", 18);
        persona1.setEstatura(1.75);
        persona1.setPeso(57);
        System.out.print("Persona 1\n");
        System.out.print(persona1.toString());
        System.out.println("IMC: " + persona1.IMC() + "\n");
        persona persona2 = new persona("Aurora", "Presuel", 18, 1.77, 60);
        System.out.print("Persona 2\n");
        System.out.print(persona2.toString());
        System.out.println("IMC: " + persona2.IMC() + "\n");
    }
}
