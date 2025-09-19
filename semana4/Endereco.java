package semana4;

public class Endereco {
    private String rua;
    private String cidade;
    private int numero;
    private int cep;
    private boolean casa;
    private String complemento;
    private String bairo;
    private String estado;

    public Endereco(String rua, String cidade, int numero, int cep, boolean casa, String complemento, String bairo, String estado){
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        this.casa = casa;
        this.complemento = complemento;
        this.bairo = bairo;
        this.estado = estado;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public boolean getCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairo() {
        return bairo;
    }

    public void setBairo(String bairo) {
        this.bairo = bairo;
    }

   public String getEstado(){
        return estado;
   }

   public void setEstado(String estado) {
        this.estado = estado;
    }

    public String mostrarEndereco(){
        String descricao = "sim";
        if(!casa){
            descricao = "nao";
        }
        return String.format("%s, %d, %s, CEP: %d, %s, %s - %s, casa: %s", rua, numero, bairo, cep, complemento, cidade, estado, descricao);
    }
}
