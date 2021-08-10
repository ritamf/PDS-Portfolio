package ex3;

public class Inventario implements LivroState {
	
    private Livro livro;

    public Inventario(Livro novoLivro) {
        this.livro = novoLivro;
    }
    
	@Override
	public void regista() {
		this.livro.setLivroState(this.livro.getDisponivelState());
		System.out.println("O livro foi registado com sucesso! O livro agora está no estado Disponível");
		
	}

	@Override
	public void requisita() {
		System.out.println("É impossível requisitar um livro do Inventário");
		
	}

	@Override
	public void devolve() {
		System.out.println("É impossível devolver um livro do Inventário");
		
	}

	@Override
	public void reserva() {
		System.out.println("É impossível reservar um livro do Inventário");
		
	}

	@Override
	public void cancelaReserva() {
		System.out.println("É impossível cancelar a reserva de um livro do Inventário");
	}

}
