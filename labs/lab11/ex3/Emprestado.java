package ex3;

public class Emprestado implements LivroState {
    
	private Livro livro;
	
    public Emprestado(Livro novoLivro) {
        this.livro = novoLivro;
    }
    
	@Override
	public void regista() {
		System.out.println("É impossível registar um livro Emprestado");
	}

	@Override
	public void requisita() { 
		System.out.println("É impossível registar um livro Emprestado");
		
	}

	@Override
	public void devolve() { 
		this.livro.setLivroState(this.livro.getDisponivelState());
		System.out.println("O livro foi devolvido com sucesso! O livro agora está no estado Disponivel");
		
	}

	@Override
	public void reserva() { 
		System.out.println("É impossível registar um livro Emprestado");
	
	}

	@Override
	public void cancelaReserva() {
		System.out.println("É impossível registar um livro Emprestado");
	}

}
