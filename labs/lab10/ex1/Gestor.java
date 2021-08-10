import java.util.ArrayList;

public class Gestor implements Observer{

	String nome;
	ArrayList<Produto> produtos = new ArrayList<>();

	public Gestor(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(String s) {
		System.out.println(s);
	}
	@Override
	public String getTipoObserver() {
		return "Gestor";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addProduct(Produto produto) {
		produtos.add(produto);
		produto.addObserver(this);
	}
	
	public void startLeilao(Produto produto, int maxTime) {
		produto.makeAlive(maxTime);
	}

}