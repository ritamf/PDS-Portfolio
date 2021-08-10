import java.util.ArrayList;

public class Caixa extends Produto {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private String nome;
	private Double weight;

	public Caixa(String nome, Double weight) {
		this.nome = nome;
        this.weight = ((Double) weight);
	}

    public void add(Produto p) {
        produtos.add(p);
    }

	public void draw() {
		System.out.println("* Caixa '" + this.nome + "' [ Weight: " + this.weight + " ; Total: " + this.weight + "]"); 
        for (Produto p:produtos) {
            if (p instanceof Caixa) {
                System.out.print("\t"); p.draw();
            } else {
                System.out.print("\t\t"); p.draw(); }
        }
	}

}