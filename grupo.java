public class grupo {
    public static void main(String[] args) {
        estudiante[] Amigo = new estudiante[3];
        for (int i = 0; i < 3; i++) {
            Amigo[i] = new estudiante();
        }
        // ----------------------------------------
        Amigo[0].setNombres("Andres");
        Amigo[0].setEdad(43);
        Amigo[1].setNombres("Aurora");
        Amigo[1].setEdad(99);
        Amigo[2].setNombres("Maria");
        Amigo[2].setEdad(999);
        // ----------------------------------------
        if (Amigo[0].getEdad() > Amigo[1].getEdad()) {
            if (Amigo[0].getEdad() > Amigo[2].getEdad()) {
                System.out.println(Amigo[0].toString() + " es mayor que todos.");
            } else {
                System.out.println(Amigo[2].toString() + " es mayor que todos.");
            }
        } else {
            if (Amigo[1].getEdad() > Amigo[2].getEdad()) {
                System.out.println(Amigo[1].toString() + " es mayor que todos.");
            } else {
                System.out.println(Amigo[2].toString() + " es mayor que todos.");
            }
        }
    }
}
