import java.util.ArrayList;
import java.util.Date;

public class Produto {
	int uid;
	String descricao;
	double preco;
	Estado estado;
	ArrayList<Observer> subscritos;
	Date startTime;
	int maxTime = 0;

	public Produto(String descricao, double novoPreco) {
		this.descricao = descricao;
		this.preco = novoPreco;
		this.estado = Estado.STOCK;
		subscritos = new ArrayList<>();
	}
	

	public boolean receberLicitacao(double novoPreco, Observer o) {	
		Date currentTime = new Date();
		int segundos = 0;
		if(startTime != null) 
			segundos = (int)((currentTime.getTime() - startTime.getTime()) / 1000);
		
		if(novoPreco <= preco || this.estado != Estado.LEILAO || segundos > maxTime || o.getTipoObserver() != "Cliente") {

			if(segundos > maxTime) 
				this.estado = Estado.VENDAS;
			
			return false;

		} else {
			preco = novoPreco;
			System.out.println("Passaram-se " + segundos + " segundos.");
			notify(" Nova licitação com valor " + novoPreco + " feita por " + o.getNome() + " ao produto " + this.descricao);
			
		}
		return true;
	}
	
	public boolean addObserver(Observer obs) {

      if(this.estado == Estado.LEILAO) {
          subscritos.add(obs);
          return true;
      }

      return false;
	}

	public void makeAlive(int mt) {
      this.estado = Estado.LEILAO;
      startTime = new Date();
      maxTime = mt;
	}

	public void notify(String s) {
		for(Observer p : subscritos) {
			p.update("[" + p.getTipoObserver() + " - " + p.getNome() + "]" + s);
		}
	}
}