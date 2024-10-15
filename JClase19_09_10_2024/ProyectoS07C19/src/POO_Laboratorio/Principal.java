package POO_Laboratorio;
/*
Diseñe la clase Alumno en el paquete POO_Laboratorio con los atributos
codigo (int),nombre (String),curso(String),nota1(double) y nota2(double)
Implemente además:
- Un Constructor Vacio
- Un método que retorne el promedio (nota1,nota2).
- Un método que sin retorno que muestre sus datos.
En la clase principal, debe realizar:
- Declare y cree un objeto de tipo Alumno.
- Ingrese datos fijos a sus atributos.
- Visualice todos sus datos.
*/
public class Principal {
    public static void main(String[] args) {
        //Instanciar una objeto de la clase Alumno
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        
        //Accesar al objeto alumno para asignar valores fijos
        a1.codalu = 1000;
        a1.nomalu = "Clotilde Magallanes";
        a1.curalu = "POO";
        a1.exapar = 15.6;
        a1.exafin = 18.2;
        
        //Accesar al objeto alumno para asignar valores fijos
        a2.codalu = 2000;
        a2.nomalu = "Tiburcia Caceres";
        a2.curalu = "Java Fundamentals";
        a2.exapar = 10.6;
        a2.exafin = 15.2;
        
        //Mostrar todos los datos del alumno
        a1.mostrarDatos();
        a2.mostrarDatos();
    }
}
