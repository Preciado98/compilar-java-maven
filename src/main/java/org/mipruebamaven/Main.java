package org.mipruebamaven;

public class Main {
    public static void main(String [] arg)
    {
        Persona alumno = new Persona("Alejandra", 1246434);
        System.out.println("Nombre: " + alumno.GetNombre());
        System.out.println("Matricula" + alumno.GetMatricula());
    }
}