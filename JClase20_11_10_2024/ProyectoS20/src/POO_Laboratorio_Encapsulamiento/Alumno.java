package POO_Laboratorio_Encapsulamiento;
/*
Diseñe en la clase alumno en el paquete poo_laboratorio
*/
public class Alumno {
    //Declaracion de atributos
    private int codalu;
    private String nomalu;
    private String curalu;
    private double exapar;
    private double exafin;
    
    //Constructor
    
    //Metodos especiales getter/setter

    public int getCodalu() {
        return codalu;
    }

    public void setCodalu(int codalu) {
        this.codalu = codalu;
    }

    public String getNomalu() {
        return nomalu;
    }

    public void setNomalu(String nomalu) {
        this.nomalu = nomalu;
    }

    public String getCuralu() {
        return curalu;
    }

    public void setCuralu(String curalu) {
        this.curalu = curalu;
    }

    public double getExapar() {
        return exapar;
    }

    public void setExapar(double exapar) {
        this.exapar = exapar;
    }

    public double getExafin() {
        return exafin;
    }

    public void setExafin(double exafin) {
        this.exafin = exafin;
    }
    
    //Metodo general
    public double obtenerPromedio(){
        return (exapar + exafin)/2;
    }
    
    
    
}
