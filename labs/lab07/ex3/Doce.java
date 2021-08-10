public class Doce extends Produto {

    private String nome;
    private Double weight;

    public Doce(String nome, Double weight) {
        this.nome = nome;
        this.weight = ((Double) weight);
    }


    public void draw() {
        System.out.println("Doce '" + this.nome + "' - Weight : " + this.weight);
    }
}
