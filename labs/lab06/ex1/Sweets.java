import java.util.Iterator;

public class Sweets {

    public static void printAllEmployees(Employee[] currentEmployees) {
        System.out.println("Current employees:");
        for (int i = 0; i < currentEmployees.length; i++) {
            System.out.println(currentEmployees[i].getName());
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // criar employees
        Employee joao = new Employee("Joao",0,3000);
        Employee maria = new Employee("Maria",1,4000);
        Employee rui = new Employee("Rui",2,750);

        // criar db
        Database db = new Database();

        // por employees na db
        db.addEmployee(joao);
        db.addEmployee(maria);
        db.addEmployee(rui);

        // testar employees colocados - 3 employees
        Employee[] currentEmployees = db.getAllEmployees();
        printAllEmployees(currentEmployees);

        // remover employee da db
        db.deleteEmployee(rui.getEmpNum());

        // testar employees colocados - 2 employees
        currentEmployees = db.getAllEmployees();
        printAllEmployees(currentEmployees);

    }
}
