package POO_Laboratorio_Encapsulamiento;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y creacion de un objeto de tipo alumno
        Alumno alumno=new Alumno();
        
        //Asignar valores a los atributos provados del objeto
        //Mediante lso metodos setter
        alumno.setCodalu(1000);    //
        alumno.setNomalu("Carlos molina");
        alumno.setCuralu("POO");
        alumno.setExapar(15);
        alumno.setExafin(18);
        
        //Invocar un metodo para mostrar los datos del alumno
        //Mediante los metodos getter  //el get es para leer
        listado(alumno );
    }
    public static void listado(Alumno a){
        System.out.println("Codigo del estudiante: " + a.getCodalu());
        System.out.println("Nombre del estudiante: " + a.getNomalu());
        System.out.println("Curso del estudiante: " + a.getCuralu());
        System.out.println("Examen parcial: " + a.getExapar());
        System.out.println("Examen final: " + a.getExafin());
        System.out.println("Promedio del curso: " + a.obtenerPromedio());
        
    }
    
}
