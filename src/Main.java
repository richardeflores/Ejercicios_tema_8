public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("María");
        persona.setEdad(25);
        persona.setTelefono(785486342);

        System.out.println("Nombre de la persona: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad() + " años");
        System.out.println("Número de teléfono: " + persona.getTelefono());
    }
}
 //Creación clase persona
class Persona {
    private float edad;
    private String nombre;
    private int telefono;

    //Setter ang Getter Edad
    public float getEdad() {

        return edad;
    }

    public void setEdad(float edad) {

        this.edad = edad;
    }

     //Setter ang Getter Nombre
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

     //Setter ang Getter Telefono

    public int getTelefono() {
        return telefono;
    }

     public void setTelefono(int telefono) {

         this.telefono = telefono;
     }

}

