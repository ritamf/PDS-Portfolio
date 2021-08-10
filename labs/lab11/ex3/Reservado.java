package ex3;

public class Reservado implements LivroState {
    
	private Livro livro;
	
    public Reservado(Livro novoLivro) {
        this.livro = novoLivro;
    }
    
	@Override
	public void regista() {
		System.out.println("É impossível registar um livro Reservado");
	}

	@Override
	public void requisita() {
		System.out.println("É impossível requisitar um livro Reservado");
		
	}

	@Override
	public void devolve() {
		System.out.println("É impossível devolver um livro Reservado");
		
	}

	@Override
	public void reserva() {
		System.out.println("É impossível reservar um livro Reservado");
		
	}

	@Override
	public void cancelaReserva() {
		this.livro.setLivroState(this.livro.getDisponivelState());
		System.out.println("A reserva do livro foi cancelada com sucesso! O livro agora está no estado Disponível");
	}

}
