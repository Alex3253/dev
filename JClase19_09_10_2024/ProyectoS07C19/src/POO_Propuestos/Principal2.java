package POO_Propuestos;
/*
Diseñe la clase Filmacion en el POO_Propuestos con los atributos públicos:
codigo (int), título (String), duración en minutos (entero) y precio en soles (double).
Implemente además:
- Un Constructor con parametros
- Un método que retorne el precio del video en dólares. Considere que: 1 dólar = 3.38 soles.
En la clase principal, a la pulsación del botón Procesar:
- Declare y cree un objeto de tipo Filmacion.
- Ingrese datos fijos al crear el objeto.
- Visualice todos sus datos.
*/
public class Principal2 {
    public static void main(String[] args) {
        //declaracion y creacion de un objeto de tipo filmacion
        Filmacion filmacion= new Filmacion(1000, "et", 120, 20.00);
        mostrarDatos(filmacion);
        
        //invocar un metodo para mostrar los datos
           
    }
    static void mostrarDatos(Filmacion f){
        System.out.println("Codigo de la pelicula: " + f.codigo);
        System.out.println("Nombre de la pelicula: " + f.titulo);
        System.out.println("Duracion de laq pelicula: " + f.duracion);
        System.out.println("Precio en soles: " + f.precio);
        System.out.println("Converesion en dolares: " + f.convertirPrecioADolares());
        
    }
    
}
