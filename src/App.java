public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        Exercicio ex = new Exercicio("Soprar bolinhas de algoção", "Usar canudo para soprar bolinhas por um caminho até um alvo", "/", 5, "");

        Exercicio ex1 = new Exercicio("Vibrar labios", "Fazer os labios vibrarem", "brrrr-som de motor", 2, "");

        System.out.println("Nome: "+ ex.getNome()+ "\nDescrição: " +ex.getDescricao()+ "\nSom: "+ ex.getSom()+"\nExemplo: "+ ex.getExemplo());
        System.out.println("\nExemplo2 ----"+"\nNome: "+ ex1.getNome()+ "\nDescrição: " +ex1.getDescricao()+ "\nSom: "+ ex1.getSom()+"\nExemplo: "+ ex1.getExemplo());

        Clinica c1 = new Clinica("Clinica FonoCEI", "0001002000169");
        Clinica c2 = new Clinica("Clinica BsB - Fono", "5555040000159");
        System.out.println("===== CLINICA 1 ====="+ "\nNome da clinica: "+c1.getNome()+"\n CNPJ: "+ c1.getCnpj());
        System.out.println("===== CLINICA 2 ====="+"\nNome da clinica: "+c2.getNome()+"\n CNPJ: "+ c2.getCnpj());



    }
}
