package POO_Propuestos;

public class Trabajador {
    //Atributos de clase
    int codigo;
    String nombre;
    int htrabajadas;
    double thoraria;
    
    //constructor
    Trabajador(){
        
    }
    
    //metodos
    double calcularSueldoBruto(){
        return htrabajadas * thoraria;
    }
    
    //metodo para el descuento
    double calcularDescuento() {
        double descuento;

        if (calcularSueldoBruto() < 4500) {
            descuento = calcularSueldoBruto() * 0.12; // 12% descuento
        } else if (calcularSueldoBruto() >= 4500 && calcularSueldoBruto() < 6500) {
            descuento = calcularSueldoBruto() * 0.14; // 14% descuento
        } else {
            descuento = calcularSueldoBruto() * 0.16; // 16% descuento
        }

        return descuento;
    }
    
    //Metodo para el sueldo neto
    double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularDescuento();
    }
    
    void mostrarDatos(){
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas Trabajadas: " + htrabajadas);
        System.out.println("Tarifa Horaria: " + thoraria);
        System.out.println("");
        System.out.println("Sueldo Bruto: " + calcularSueldoBruto());
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Sueldo Neto: " + calcularSueldoNeto());
        
    }
 
}
