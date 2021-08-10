public class Conserva extends Produto{
    private String nome;
	private Double weight;

	public Conserva(String nome, Double weight) {
		this.nome = nome;
        this.weight = ((Double) weight);
	}


	public void draw() {
		System.out.println("Conserva '" + this.nome + "' - Weight : " + this.weight); 
	}
}
