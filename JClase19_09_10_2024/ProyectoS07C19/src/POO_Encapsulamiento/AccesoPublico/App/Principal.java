package POO_Encapsulamiento.AccesoPublico.App;

import POO_Encapsulamiento.AccesoPublico.Models.Estudiante;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y creacion de un objeto
        Estudiante e1 = new Estudiante();
        
        //Accesar a los valores del objeto e1
        e1.codest = 100;
        e1.nomest = "Miguel Asturias";
        e1.edaest = 25;
    }
}
