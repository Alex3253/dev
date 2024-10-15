package POO_Laboratorio_Encapsulamiento;

public class Primcipal2 {
    public static void main(String[] args) {
        //Declaracion y creacion de un objeto de tipo celular
        Celular celular=new Celular(96498520, "Sebastian", 300, 5);
        
        //Invocar el metodo listado  //se usan "metodos"
        listado(celular);
        //Modificar el numero de segundos consumidos para aumentar en 20
        celular.setSegConsumidos(celular.getSegConsumidos() + 20);
        
        //Invocar el metodos listado
        listado(celular);
        
        //Moidificar el precio por segundo para disminuir en 5%
        celular.setPreSegundos(celular.getPreSegundos()-(celular.getPreSegundos()* 0.05));
        listado(celular);
        
        
    }
    public static void listado(Celular c){
        System.out.println("Numero de celular: " + c.getNumero());
        System.out.println("Usuario de celular: " + c.getUsuario());
        System.out.println("Segundos consumidos: " + c.getSegConsumidos());
        System.out.println("Precio x segundo: " + c.getPreSegundos());
        System.out.println("");
        System.out.println("Costo x consumo: " + c.obtenerCostoxConsumo());
        System.out.println("Impuesto IGV: " + c.obtenerIGV());
        System.out.println("Total a pagar: " + c.obtenerTotalPago());
        System.out.println("");
        System.out.println("----------------------------------------");
        
    }
    
}
