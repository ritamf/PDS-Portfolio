public class Main 
{
    public static final String[] names = {"Lokesh", "Kushagra", "Vikram"};

    public static void main(String[] args) 
    {
        Emp emp1 = getClient("Lokesh");
        Emp emp2 = getClient("Kushagra");
        Emp emp3 = getClient("Vikram");
        Emp emp4 = getClient("Rishabh");
  
  
        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }

    public static Emp getClient(String name)
    {
        for (int i = 0; i < names.length; i++) 
        {
            if (names[i].equalsIgnoreCase(name))
            {
                return new Coder(name);
            }
        }
        return new NoClient();
    }
}