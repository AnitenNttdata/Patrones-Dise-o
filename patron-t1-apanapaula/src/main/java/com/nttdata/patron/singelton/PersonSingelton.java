package com.nttdata.patron.singelton;

public class PersonSingelton {

    private String nombre;
    private static PersonSingelton personSing;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private PersonSingelton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static PersonSingelton getSingletonInstance(String nombre) {
        if (personSing == null){
            personSing = new PersonSingelton(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase Person");
        }
        
        return personSing;
    }
    
  //Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public PersonSingelton clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase Persona");
        }
        return null; 
    }

	public char[] getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
    

    
    // metodos getter y setter

}