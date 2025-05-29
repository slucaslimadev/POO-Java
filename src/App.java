public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");

        // EXERCICIOS 
        Exercicio ex = new Exercicio("Soprar bolinhas de algoção", "Usar canudo para soprar bolinhas por um caminho até um alvo", "/", 5, "");
        Exercicio ex1 = new Exercicio("Vibrar labios", "Fazer os labios vibrarem", "brrrr-som de motor", 2, "");
        Exercicio ex2 = new Exercicio("Apito do Navio");

        System.out.println("=== EXERCICIO 1 ==="+"\nNome: "+ ex.getNome()+ "\nDescrição: " +ex.getDescricao()+ "\nSom: "+ ex.getSom()+"\nExemplo: "+ ex.getExemplo());
        System.out.println("=== EXERCICIO 2 ==="+"\nNome: "+ ex1.getNome()+ "\nDescrição: " +ex1.getDescricao()+ "\nSom: "+ ex1.getSom()+"\nExemplo: "+ ex1.getExemplo());
        System.out.println("=== EXERCICIO 3 ==="+"\nNome: "+ ex2.getNome());
        
        // CLINICAS 
        Clinica c1 = new Clinica("Clinica FonoCEI", "0001002000169");
        Clinica c2 = new Clinica("Clinica BsB - Fono", "5555040000159");

        System.out.println("\n=== CLINICA 1 ==="+ "\nNome da clinica: "+c1.getNome()+"\n CNPJ: "+ c1.getCnpj());
        System.out.println("=== CLINICA 2 ==="+"\nNome da clinica: "+c2.getNome()+"\n CNPJ: "+ c2.getCnpj());

        // PACIENTES

        Paciente p1 = new Paciente("Lucas dos santos", "lucaslima.rec@gmail.com");
        Paciente p2 = new Paciente("Fernando Gomes", "fernando.gomes@gmail.com");
        System.out.println("\n=== PACIENTE 1 ==="+"\n Nome do paciente: "+p1.getNome()+"\n Email do paciente: "+p1.getEmail());
        System.out.println("\n=== PACIENTE 2 ==="+"\n Nome do paciente: "+p2.getNome()+"\n Email do paciente: "+p2.getEmail());

        // PROFISSIONAIS
        Profissional prof1 = new Profissional("Dr. Ricardo Nunes", "61999995511");
        Profissional prof2 = new Profissional("Dra. Ana Louise", "619988888851");
        System.out.println("\n=== PROFISSIONAL 1 ==="+"\n Nome do profissional: "+prof1.getNome()+"\n Telefone: "+ prof1.getTelefone());
        System.out.println("\n=== PROFISSIONAL 2 ==="+"\n Nome do profissional: "+prof2.getNome()+"\n Telefone: "+ prof2.getTelefone());



    }
}
