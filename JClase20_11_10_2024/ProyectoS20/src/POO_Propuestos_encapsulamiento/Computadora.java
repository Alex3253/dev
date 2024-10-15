package POO_Propuestos_encapsulamiento;

public class Computadora {
    //Atrubutos
    private int codigo;
    private String marca;
    private String color;
    private Double precio;
    
    //Constructor
    
    
    
    public Computadora(int codigo, String marca, String color, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }
    
    //Metodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
