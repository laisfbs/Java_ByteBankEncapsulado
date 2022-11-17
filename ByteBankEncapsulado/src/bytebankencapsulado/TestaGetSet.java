package bytebankencapsulado;

public class TestaGetSet {

    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
     
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Oliveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("Analista");
        System.out.println("A profissao do titular " + conta.getTitular().getNome() + " eh " + conta.getTitular().getProfissao() + " ... ");
        
        conta .getTitular().setNome("Lais Fernanda");
        System.out.println("A profissao do titular " + conta.getTitular().getNome() + " eh " + conta.getTitular().getProfissao() + " ... ");
    }        
}
