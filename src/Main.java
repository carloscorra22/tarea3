public class Main {
    public static void main(String[] args) {
    Persona persona=new Persona();

    persona.setEdad("22");
    persona.setNombre("juan");
    persona.setTelefono("022133443532");

    String edad= persona.getEdad();
    String nombre = persona.getNombre();
    String telefono = persona.getTelefono();

    System.out.println(edad);
    System.out.println(nombre);
    System.out.println(telefono);


    }
}
class Persona{
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad(String edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public String getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}