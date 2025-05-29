public class Exercicio {
    private int id;
    private String nome;
    private String descricao;
    private String som;
    private int tempoMin;
    private String exemplo;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    public String getSom() {
        return som;
    }


    public String getExemplo() {
        return exemplo;
    }


    public Exercicio(){




    }


    public Exercicio(String nome, String descricao, String som, int tempoMin, String exemplo){
        this.nome = nome;
        this.descricao = descricao;
        this.som = som;
        this.tempoMin = tempoMin;
        this.exemplo = exemplo;
    }


    public Exercicio(String nome, String descricao,String exemplo){
        this.nome = nome;
        this.descricao = descricao;
        this.exemplo = exemplo;
    }
    
    public Exercicio(String nome){
        this.nome = nome;
    }


}
