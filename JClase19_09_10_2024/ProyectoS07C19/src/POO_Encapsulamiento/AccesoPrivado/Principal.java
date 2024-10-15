package POO_Encapsulamiento.AccesoPrivado;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y creacion de un obejto
        Cliente c1 = new Cliente();
        
        //Accesar a sus atributos para agregar o modificar sus valores
        c1.setCodcli(100);
        c1.setNomcli("Castañeda Fierro");
        c1.setTipcli(1);
        
        //Accesar a sus atributos para leer o mostrar sus valores
        System.out.println("Codigo del cliente : " + c1.getCodcli());
        System.out.println("Nombre del cliente : " + c1.getNomcli());
        System.out.println("Tipo del cliente : " + c1.getTipcli());
    }
}
