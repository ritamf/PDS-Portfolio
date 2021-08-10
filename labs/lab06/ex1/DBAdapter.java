import java.util.List;

public class DBAdapter implements DBAdapterInterface {
    private Database sweetsDB;
	private Registos petiscosDB;
    
    public DBAdapter(Database sDB, Registos pDB) {
        this.sweetsDB=sDB;
        this.petiscosDB=pDB;
    }

    @Override
    public void addEmployee(Employee e) {
        sweetsDB.addEmployee(e);
    }

    @Override
    public void addEmployee(Empregado e) {
        petiscosDB.insere(e);
    }

    @Override
    public void deleteEmployee(long num) {
        sweetsDB.deleteEmployee(num);
        petiscosDB.remove((int) num);
    }

    @Override
    public boolean isEmployee(int num) {
        
        Employee[] arr_employees = sweetsDB.getAllEmployees();

        for (int i = 0; i < arr_employees.length; i++)
            if ((int)arr_employees[i].getEmpNum()==num)
                return true;

        return petiscosDB.isEmpregado(num);
    }

    @Override
    public void printAllEmployees() {
        
        Employee[] allEmployees = sweetsDB.getAllEmployees();
        List<Empregado> allEmpregados = petiscosDB.listaDeEmpregados();

        System.out.println("Current employees:");

        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println("Name: " + allEmployees[i].getName()
                                + "\nEmpNum: " + allEmployees[i].getEmpNum()
                                + "\nSalary: " + allEmployees[i].getSalary()+"\n");
        }

        for (int i = 0; i < allEmpregados.size(); i++) {
            System.out.println("Nome: " + allEmpregados.get(i).nome()
                                + "\nApelido: " + allEmpregados.get(i).apelido()
                                + "\nCodigo: " + allEmpregados.get(i).codigo()
                                + "\nSalario: " + allEmpregados.get(i).salario()+"\n");
        }
        
        System.out.println();
    
    }
}
