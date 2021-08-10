package ex3;

public class Disponivel implements LivroState {
	
    private Livro livro;
    
    public Disponivel(Livro novoLivro) {
        this.livro = novoLivro;
    }
    
	@Override
	public void regista() {
		System.out.println("É impossível registar um livro Disponivel");
	}

	@Override
	public void requisita() { 
		this.livro.setLivroState(this.livro.getEmprestadoState());
		System.out.println("O livro foi emprestado com sucesso! O livro agora está no estado Emprestado");
		
	}

	@Override
	public void devolve() {
		System.out.println("É impossível devolver um livro Disponivel");
		
	}

	@Override
	public void reserva() { 
		this.livro.setLivroState(this.livro.getReservadoState());
		System.out.println("O livro foi reservado com sucesso! O livro agora está no estado Reservado");
	
	}

	@Override
	public void cancelaReserva() {
		System.out.println("É impossível devolver um livro Disponivel");
	}


}
