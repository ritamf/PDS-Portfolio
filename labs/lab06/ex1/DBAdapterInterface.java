public interface DBAdapterInterface {
    
    // adicionar um empregado da empresa Sweets
    public void addEmployee(Employee e);

    // adicionar um empregado da empresa Petiscos
    public void addEmployee(Empregado e);

    // remover um empregado, dado o número de funcionário
    public void deleteEmployee(long num);

    // verificar se um empregado existe na empresa, dado o número do empregado
    public boolean isEmployee(int num);

    // imprimir os registos de todos os funcionários
    public void printAllEmployees();
}
