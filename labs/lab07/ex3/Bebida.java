public class Bebida extends Produto{
    // new Bebida("Vinho Reserva UA 2017", 6));
    // Bebida 'Vinho Reserva UA 2018' - Weight : 6.0
    private String nome;
	private Double weight;

	public Bebida(String nome, Double weight) {
		this.nome = nome;
        this.weight = ((Double) weight);
	}


	public void draw() {
		System.out.println("Bebida '" + this.nome + "' - Weight : " + this.weight); 
	}
}
