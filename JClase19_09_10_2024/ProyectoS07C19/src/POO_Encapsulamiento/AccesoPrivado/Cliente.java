package POO_Encapsulamiento.AccesoPrivado;

public class Cliente {
    //Atributos con acceso privados dentro o fuera paquete
    private int codcli;
    private String nomcli;
    private int tipcli;
    
    //Constructores
    //Metodos especiales getter (leer)/ setter (escribir)
    
    //Metodos Generales
    public int getCodcli() {
        return codcli;
    }

    public void setCodcli(int codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public int getTipcli() {
        return tipcli;
    }

    public void setTipcli(int tipcli) {
        this.tipcli = tipcli;
    }
}
