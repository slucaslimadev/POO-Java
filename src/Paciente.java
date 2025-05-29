public class Paciente {
    private int id;
    private String nome;
    private String email;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }

    public Paciente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
}
