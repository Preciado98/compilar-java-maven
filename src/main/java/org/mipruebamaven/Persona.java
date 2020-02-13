package org.mipruebamaven;

public class Persona {
    private String mi_nombre;
    private int mi_matricula;
    Persona(String nombre, int matricula)
    {
        mi_nombre = nombre;
        mi_matricula = matricula;
    }

    String GetNombre()
    {
        return mi_nombre;
    }

    int GetMatricula()
    {
        return mi_matricula;
    }

}
