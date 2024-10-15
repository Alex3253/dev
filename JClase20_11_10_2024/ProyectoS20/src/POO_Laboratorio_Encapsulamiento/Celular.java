package POO_Laboratorio_Encapsulamiento;

public class Celular {
    //Atributos
    private int numero;
    private String usuario;
    private int segConsumidos;
    private double preSegundos;
    
    //Constructor con parametros

    public Celular(int numero, String usuario, int segConsumidos, double preSegundos) {
        this.numero = numero;
        this.usuario = usuario;
        this.segConsumidos = segConsumidos;
        this.preSegundos = preSegundos;
    }
    
    //Metodos especiales getter / setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSegConsumidos() {
        return segConsumidos;
    }

    public void setSegConsumidos(int segConsumidos) {
        this.segConsumidos = segConsumidos;
    }

    public double getPreSegundos() {
        return preSegundos;
    }

    public void setPreSegundos(double preSegundos) {
        this.preSegundos = preSegundos;
    }
    
    
    //Metodo general - obtener costo x consumo
    double obtenerCostoxConsumo(){
        return segConsumidos * preSegundos;
    }
    
    //Metodo general - obtener igv 
    double obtenerIGV(){
        return obtenerCostoxConsumo() * 0.18;
    }
    
    //Metodo general - total a pagar
    double obtenerTotalPago(){
        return obtenerCostoxConsumo() + obtenerIGV();
    }
    
    
}
