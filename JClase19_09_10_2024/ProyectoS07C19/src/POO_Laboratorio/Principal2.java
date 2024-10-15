package POO_Laboratorio;
/*
Diseñe la clase Producto en el paquete POO_Laboratorio con los atributos
codigo (int),nombre (String),precio(double),cantidad(int).
Implemente además:
- Un Constructor con parametros
- Un método que retorne el importe de compras (impcom).
- Un método que retorne el importe de descuento segun la tabla (impdes)
    importe de compras          Descuento
    ------------------      ------------------
        hasta 500              10% del importe
        mas de 500             20% del importe
- Un método que retorne el importe a pagar (impcom - impdes).
- Un método que sin retorno que muestre sus datos.
En la clase principal, debe realizar:
- Declare y cree un objeto de tipo Producto.
- Ingrese datos fijos al crear el objeto.
- Visualice todos sus datos.
*/
public class Principal2 {
    public static void main(String[] args) {
        //Declaraion y creacion de un objeto con parametros
        Producto p1 = new Producto(1000,"Lavadora",10,1500);
        Producto p2 = new Producto(2000,"Aspiradora",5,3100);
        //Mostrar datos
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
