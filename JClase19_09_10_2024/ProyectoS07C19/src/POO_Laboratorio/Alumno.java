package POO_Laboratorio;
//Clase es una plantilla / Modelo / Entidad / Estructura Vacia
public class Alumno {
    //Atributos o propiedades
    int codalu;
    String nomalu, curalu;
    double exapar, exafin;
    
    //Constructor Vacio (Se crea de manera automatica
    /*
    Alumno(){
    }
    */
    
    //Metodo General con retorno
    double obtenerPromedio(){
        double promedio = ( exapar + exafin ) / 2;
        return promedio;
    }
    
    //Metodo General sin retorno
    void mostrarDatos(){
        System.out.println("Codigo : " + codalu + " | " + "Nombre : " + nomalu + "\n" +
                "Curso : " + curalu + " | " + "Examen Parcial : " + exapar + " | " + "Examen Final : "+ exafin + "\n" +
                "Promedio del Curso : " + obtenerPromedio());
    }
}
