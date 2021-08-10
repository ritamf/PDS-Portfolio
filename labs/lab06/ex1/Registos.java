import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Registos {
    private ArrayList<Empregado> empregados;

    // Stores the employees
    public Registos() {
        empregados = new ArrayList<>();
    }

    public void insere(Empregado emp) {
        empregados.add(emp);
    }

    public void remove(int codigo) {
        for (Empregado emp : empregados)
            if (emp.codigo() == codigo){
                empregados.remove(emp);
                break;
            }
    }

    public boolean isEmpregado(int codigo) {
        for (Empregado emp : empregados)
            if ( emp.codigo() == codigo)
                return true;
        return false;
    }

    // método para retornar coleção de empregados
    public List<Empregado> listaDeEmpregados() { 
        return empregados;
    }
}