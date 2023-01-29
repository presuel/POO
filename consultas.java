public class consultas {
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona1.nombres = "Andrea";
        persona1.apellidos = "Presuel";
        persona1.altura = 1.75;
        persona1.peso = 57;
        persona1.edad = 18;
        System.out.print("Persona 1\n");
        System.out.println(persona1.nombres + " " + persona1.apellidos);
        System.out.println("edad: " + persona1.edad + " , altura: " + persona1.altura +
                " m. , peso: " + persona1.peso + " kg.\n");
        persona persona2 = new persona();
        persona2.nombres = "Aurora";
        persona2.apellidos = "Presuel";
        persona2.altura = 1.77;
        persona2.peso = 60;
        persona2.edad = 18;
        System.out.print("Persona 2\n");
        System.out.println(persona2.nombres + " " + persona2.apellidos);
        System.out.println("edad: " + persona2.edad + " , altura: " + persona2.altura +
                " m. , peso: " + persona2.peso + " kg.\n");
    }
}
