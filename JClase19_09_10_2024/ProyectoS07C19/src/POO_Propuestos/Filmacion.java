package POO_Propuestos;

public class Filmacion {
    //atributos
    int codigo;
    String titulo;
    int duracion;
    double precio;
    
    //constructor
    Filmacion(int codigo, String titulo, int duracion, double precio){
        this.codigo=codigo;
        this.titulo=titulo;
        this.duracion=duracion;
        this.precio=precio;
    }
    
    
    // Método que convierte el precio de soles a dólares
    double convertirPrecioADolares() {
        return precio / 3.38; //la conversion de dolarwes a soles es divisicon
        
    }
    
    //
    
    
    
    
    
}
