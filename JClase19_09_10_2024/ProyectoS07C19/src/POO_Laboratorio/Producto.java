package POO_Laboratorio;

public class Producto {
    //Atributos
    int codprod,canprod;
    String nomprod;
    double preprod;
    
    //Constructor con parametros
    Producto(int codprod, String nomprod, int canprod, double preprod){
        this.codprod = codprod;
        this.nomprod = nomprod;
        this.canprod = canprod;
        this.preprod = preprod;
    }
    
    //Metodo con retorno : importe de compra
    double obtenerImpCom(){
        return canprod * preprod;
    }
    
    //Metodo con retorno : importe de descuento
    double obtenerImpDes(){
        double impdes;
        if(obtenerImpCom() <= 500){
            impdes = obtenerImpCom() * 0.10;
        }else{
            impdes = obtenerImpCom() * 0.20;
        }
        return impdes;
    }
    
    //Metodo con retorno : importe de pago
    double obtenerImpPag(){
        return obtenerImpCom() - obtenerImpDes();
    }
    
    //Metodo sin Retorno : Mostrar Datos Completos
    void mostrarDatos(){
        System.out.println("Codigo del producto : " + codprod + " Nombre del producto : " + nomprod + "\n" +
                "Precio del Producto : " + preprod + " Cantidad a comprar : " + canprod + "\n" + 
                "Importe de Compra : " + obtenerImpCom() + " Importe de Descuento : " + obtenerImpDes() + " Impote de Pago : " + obtenerImpPag());
    }
}
