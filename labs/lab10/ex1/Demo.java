import java.util.concurrent.TimeUnit;

public class Demo {

    public static Produto p1;
    public static Produto p2;
    public static Produto p3;
    public static Produto p4;
    public static Produto p5;

    public static Cliente c1;
    public static Cliente c2;
    public static Cliente c3;

    public static Gestor gestor;

    public static void main(String[] args) {
        criarProdutosEObservers();
        testarLicitacoes();
    }

    public static void criarProdutosEObservers() {
		p1 = new Produto("batata", 500.99);
		p2 = new Produto("cebola", 600.99);
		p3 = new Produto("mesa", 700.99);
		p4 = new Produto("cadeira", 800.99);
		p5 = new Produto("foguetão da SpaceX", 0.02);

		c1 = new Cliente("Joao");
		c2 = new Cliente("Maria");
		c3 = new Cliente("Francisco");
		
		gestor = new Gestor("Gestor");
    }

    public static void testarLicitacoes() {
        gestor.addProduct(p1);
		gestor.addProduct(p3);
		
		gestor.startLeilao(p1, 3);
		gestor.startLeilao(p3, 3);
		
		p1.addObserver(c1);
		c1.licitar(p1, 1000.0);
		
		gestor.addProduct(p2);

		p2.addObserver(c3);
		c3.licitar(p2, 2000.0);
		
		p3.addObserver(c3);
		gestor.addProduct(p4);

		c3.licitar(p3, 3000.0);
		
		gestor.startLeilao(p4, 3);

		gestor.addProduct(p5);
		gestor.startLeilao(p5, 3);

		p4.addObserver(c1);
		c1.licitar(p4, 4000.0);
	
		p5.addObserver(c2);
		c2.licitar(p5, 5000.0);
		
		p1.addObserver(c2);
		c2.licitar(p1, 6000.0); 
    }
}
