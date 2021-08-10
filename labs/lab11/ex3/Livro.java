package ex3;

public class Livro { // context
	
	//
	// states
	//
	
    private LivroState inventario;
    private LivroState disponivel;
    private LivroState emprestado;
    private LivroState reservado;
    
    private LivroState livroState;
    
    private String titulo;
    private int ISBN;
    private int ano;
    private String primeiroAutor;
    
    public Livro(String titulo, int ISBN, int ano, String primeiroAutor) {
    	this.inventario = new Inventario(this);
    	this.disponivel = new Disponivel(this);
    	this.emprestado = new Emprestado(this);
    	this.reservado = new Reservado(this);
    	
    	this.titulo = titulo;
    	this.ISBN = ISBN;
    	this.ano = ano;
    	this.primeiroAutor = primeiroAutor;
    	
    	this.livroState = inventario;
    }
    
    // 
    // getter and setter of livroState 
    // 
    
    public String getLivroState() { // pode não vir a ser necessário
    	if (this.livroState instanceof Inventario)
    		return "Inventário";
    	else if (this.livroState instanceof Disponivel)
    		return "Disponível";
    	else if (this.livroState instanceof Emprestado)
    		return "Emprestado";
    	
    	return "Reservado";
    }
    
    public void setLivroState(LivroState novoLivroState) {
        this.livroState = novoLivroState;
    }
    
    // 
    // getter and setter of book characteristics
    // 
    
    public String getTitulo() {
    	return this.titulo;
    }
    
    public int getISBN() {
    	return this.ISBN;
    }
    
    public String getPrimeiroAutor() {
    	return this.primeiroAutor;
    }
    
    //
    // operations
    //
    
    void regista() {
    	this.livroState.regista();
    }
    
    void requisita() {
    	this.livroState.requisita();
    }
    
    void devolve() {
    	this.livroState.devolve();
    }
    
    void reserva() {
    	this.livroState.reserva();
    }
    
    void cancelaReserva() {
    	this.livroState.cancelaReserva();
    }
    
    //
    // getters of all states
    //
    
    public LivroState getInventarioState() {
        return this.inventario;
    }

    public LivroState getDisponivelState() {
        return this.disponivel;
    }

    public LivroState getEmprestadoState() {
        return this.emprestado;
    }

    public LivroState getReservadoState() {
        return this.reservado;
    }

}
