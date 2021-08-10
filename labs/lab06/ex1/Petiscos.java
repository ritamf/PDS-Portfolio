import java.util.List;

public class Petiscos {

    public static void printAllEmpregados(List<Empregado> listaAtualEmpregados) {
        System.out.println("Lista atual de empregados:");
        for (int i = 0; i < listaAtualEmpregados.size(); i++) {
            System.out.println(listaAtualEmpregados.get(i).nome());
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // criar Empregados
        Empregado joao = new Empregado("Joao","Marques",0,3000);
        Empregado maria = new Empregado("Maria","Oliveira",1,4000);
        Empregado rui = new Empregado("Rui","Martins",2,750);

        // criar db
        Registos db = new Registos();

        // por 3 Empregados na db
        db.insere(joao);
        db.insere(maria);
        db.insere(rui);

        // testar empregados inseridos
        List<Empregado> listaAtualEmpregados = db.listaDeEmpregados();
        printAllEmpregados(listaAtualEmpregados);
        
        // remover um empregado da db e confirmar que a db tem 2 empregados
        db.remove(rui.codigo());
        printAllEmpregados(listaAtualEmpregados);

        // testar se certos empregados estao na lista
        System.out.println((db.isEmpregado(1))? "Maria é empregada.":"Maria não é empregada.");
        System.out.println(db.isEmpregado(2)?"Rui é empregado.":"Rui não é empregado.");

    }
}
