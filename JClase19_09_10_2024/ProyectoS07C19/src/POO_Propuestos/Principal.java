package POO_Propuestos;
/*
Diseñe la clase Trabajador en el paquete POO_Propuestos con los atributos públicos:
codigo (int), nombre (String), horas trabajadas (int) y tarifa horaria (double).
Implemente además:
- Un Constructor Vacio
- Un método que retorne el sueldo bruto (horas * tarifa).
- Un método que retorne el descuento de acuerdo a la siguiente tabla:
        Sueldo bruto        Descuento
            < 4500          12% del sueldo bruto
        ≥ 4500 y < 6500     14% del sueldo bruto
            ≥ 6500          16% del sueldo bruto
- Un método que retorne el sueldo neto (sueldo bruto - descuento).
En la clase principal, a la pulsación del botón Procesar:
- Declare y cree un objeto de tipo Trabajador.
- Ingrese datos fijos a sus atributos.
- Visualice todos sus datos.
*/
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Trabajador
        Trabajador trabajador = new Trabajador();

        // Ingresar datos fijos a los atributos
        trabajador.codigo = 101;
        trabajador.nombre = "Juan Pérez";
        trabajador.htrabajadas = 160; // Ejemplo: 160 horas al mes
        trabajador.thoraria = 30.0;  // Ejemplo: 30 por hora

        // Mostrar los datos del trabajador
        
        trabajador.mostrarDatos();

        
    }
    
    
    
}
