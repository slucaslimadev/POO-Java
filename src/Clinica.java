public class Clinica {
    String nome;
    String cnpj;
    int id;
    
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Clinica(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;

    }
    public Clinica(String nome){
        this.nome = nome;


    }
}
