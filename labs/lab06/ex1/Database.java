import java.util.Arrays;
import java.util.Vector;

class Database {

    private Vector<Employee> employees;

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        for (Employee e : employees)
            if ( e.getEmpNum() == emp_num){
                employees.remove(e);
                break;
            }
    }

    // método para retornar coleção de employees
    public Employee[] getAllEmployees() {
        Object[] obj = employees.toArray();
        Employee[] allEmployees = Arrays.copyOf(obj, obj.length, Employee[].class);

        return allEmployees;
    }
}