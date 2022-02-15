public class Pessoa {
    private Tipodocumento tipodocumento;
    private String numeroDocumento;

    public Pessoa(){
        super();
    }

    public Pessoa(Tipodocumento tipodocumento, String numeroDocumento){
        super();
        this.tipodocumento = tipodocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
    
    public String toString(){
        return "Pessoa [TipoDocumento =" + tipodocumento + ", numeroDocumento =" + numeroDocumento + "]";
    }

}
