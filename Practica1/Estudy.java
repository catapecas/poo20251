package Practica1;

public class Estudy {

    private String nombre;
    private int edad;
    private double calificacion;

    //constructor

    public Estudy (String nombre, int edad, double calificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;

    }

    //metodo getter

    public String getNombre(){
        return nombre;

    }
    

    public int getEdad(){
        return edad;

    }

    public double getCalificacion(){
        return calificacion;
    }

    // metodo setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCalificaciones(double calificacion){
        this.calificacion = calificacion;
    }
    //metodo para mostrar info
    public void mostrarInfotmacion(){
        System.out.println("nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Calificaciones:" + calificacion);
    }
    // metodo para saber si aprovo

    public boolean aprobo (){
        return calificacion >=6.0;
    }

    public void mostrarInformacion() {

    }
}
