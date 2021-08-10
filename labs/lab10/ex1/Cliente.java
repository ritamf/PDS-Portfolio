public class Cliente implements Observer{
    String nome;
    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String s) {
        System.out.println(s);
    }

    @Override
    public String getTipoObserver() {
        return "Cliente";
    }
    
    public String getNome() {
        return nome;
    }
    
    public void licitar(Produto produto, double novoPreco) {

        if ( produto != null ) {
            produto.receberLicitacao(novoPreco, this);
        } else {
            System.out.println("Não podes leiloar um produto que não existe!");
        }

    }
}
