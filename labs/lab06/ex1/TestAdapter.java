public class TestAdapter {
    public static void main(String[] args) {

        // // remover um empregado, dado o número de funcionário
        // public void deleteEmployee(long num);

        // // verificar se um empregado existe na empresa, dado o número do empregado
        // public boolean isEmployee(int num);

        Database sweetsDB = new Database();
        Registos petiscosDB = new Registos();


        DBAdapterInterface db = new DBAdapter(sweetsDB, petiscosDB);

        // adicionar empregados à db
        for (int i = 0; i < 10; i++) {
            db.addEmployee(new Employee("Employee"+i, i, i*1000));
            db.addEmployee(new Empregado("Empregado"+(i+10), "Apelido"+(i+10), (i+10), i*1000)); // o código é i+10 para não haver repetição de código
        }

        // testar employees colocados
        db.printAllEmployees();

        // remover employees
        db.deleteEmployee(2);
        db.deleteEmployee(12);

        // testar employees colocados - employyes 2 e 12 nao devem estar incluidos
        db.printAllEmployees();

        // employees 3 e 12 estao na db?
        System.out.println("Employee num 3" + (db.isEmployee(3)? " está na lista": " não está na lista"));
        System.out.println("Employee num 12" + (db.isEmployee(12)?" está na lista":" não está na lista"));

        // imprimir lista final de empregados
        db.printAllEmployees();

    }
}
